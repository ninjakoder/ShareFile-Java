package com.sharefile.api;

import com.sharefile.api.android.utils.SFLog;
import com.sharefile.api.authentication.SFOAuth2Token;
import com.sharefile.api.entities.SFSessionsEntity;
import com.sharefile.api.exceptions.SFInvalidStateException;
import com.sharefile.api.https.SFApiRunnable;
import com.sharefile.api.interfaces.SFApiClientInitListener;
import com.sharefile.api.interfaces.SFApiResponseListener;
import com.sharefile.api.models.SFODataObject;
import com.sharefile.api.models.SFPrincipal;
import com.sharefile.api.models.SFSession;
import com.sharefile.api.models.SFUser;

public class SFApiClient 
{
	private static final String TAG = "-SFApiClient";
	
	public static final String MSG_INVALID_STATE_OAUTH_NULL = "Invalid state: Oauth token not initialized for SFApiClient";
	
	private SFOAuth2Token mOAuthToken = null;
	private SFSession mSession = null;
	private SFApiClientInitListener mClientInitListner = null;
	
	private boolean mClientInitializedSuccessFully = false;
	
	
	private void copyOAuthToken(SFOAuth2Token oauthToken) throws SFInvalidStateException
	{
		validateStateBeforeInit(oauthToken);
		
		mOAuthToken = oauthToken;//TODO: Shouldn't this be cloned using a deep copy instead of maintaining a reference?
	}
	
	public SFApiClient(SFOAuth2Token oauthToken) throws SFInvalidStateException
	{	
		copyOAuthToken(oauthToken);					
	}
	
	public void reinitClientState(SFOAuth2Token oauthtoken, SFApiClientInitListener listener) throws SFInvalidStateException
	{
		copyOAuthToken(oauthtoken);
		
		init(listener);
	}
		
	private SFApiResponseListener<SFSession> mListnererGetSession = new SFApiResponseListener<SFSession>() 
	{
		@Override
		public void sfapiSuccess(SFSession sfsession) 
		{			
			mSession = sfsession; //TODO: deep copy needed?
			mClientInitializedSuccessFully = true;
						
			SFPrincipal principal = mSession.getPrincipal();
			
			if(principal instanceof SFUser)
			{
				SFLog.d2(TAG, "SESSION FOR %s = " , ((SFUser)principal).getFullName());
			}
				
			
			//TODO: can we have generic pattern for callback calling
			if(mClientInitListner!=null)
			{
				mClientInitListner.sfApiClientInitSuccess();
			}
		}

		@Override
		public void sfApiError(int errorCode, String errorMessage,SFApiQuery<SFSession> asApiqueri) 
		{		
			SFLog.d2(TAG, "API FAILURE. error code = %d", errorCode);
			
			mClientInitializedSuccessFully = false;
			
			//TODO: can we have generic pattern for callback calling
			if(mClientInitListner!=null)
			{
				mClientInitListner.sfApiClientInitError(errorCode, errorMessage);
			}
		}
	};
	
	public void init(SFApiClientInitListener listener) throws SFInvalidStateException
	{
		mClientInitializedSuccessFully = false;
		mClientInitListner = listener;
		SFApiQuery<SFSession> sfQueryGetSession = SFSessionsEntity.get();				
		SFApiRunnable<SFSession> sfApiRunnable = new SFApiRunnable<SFSession>(SFSession.class,sfQueryGetSession, mListnererGetSession, mOAuthToken);
		sfApiRunnable.startNewThread();
	}

	public <T extends SFODataObject> void executeQuery(SFApiQuery<T> query , SFApiResponseListener<T> listener) throws SFInvalidStateException
	{								
		/*
		 *  See this error for why we need to store the inner class coxz of the java generics problem
		 * 
		if(query instanceof SFApiQuery<SFSession>)
		{
			
		}
		*/
		
		validateClientState();
		
		SFApiRunnable<T> sfApiRunnable = new SFApiRunnable<T>(query.getTrueInnerClass(),query, listener, mOAuthToken);
		sfApiRunnable.startNewThread();
	}
	
	/**
	 *   Make this a more stronger check than a simple null check on OAuth. 
	 */
	private void validateStateBeforeInit(SFOAuth2Token token) throws SFInvalidStateException
	{
		if(token == null)
		{
			throw new SFInvalidStateException(MSG_INVALID_STATE_OAUTH_NULL);
		}
		
		if(!token.isValid())
		{
			throw new SFInvalidStateException(MSG_INVALID_STATE_OAUTH_NULL);
		}
	}	
	
	private void validateClientState() throws SFInvalidStateException 
	{
		if(!mClientInitializedSuccessFully)
		{
			throw new SFInvalidStateException(MSG_INVALID_STATE_OAUTH_NULL);
		}
	}
	
	public SFSession getSession()
	{
		return mSession;
	}
}
