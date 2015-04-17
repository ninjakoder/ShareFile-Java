package com.sharefile.api.interfaces;

import com.sharefile.api.authentication.SFOAuth2Token;
import com.sharefile.api.exceptions.SFSDKException;

/*
 * These callbacks are used only with the OAuthService if your app chooses to manage the tokens
 * by itself. In such case there is no need for ISFApiClient.
 */
public interface IOAuthTokenCallback
{
    public void onSuccess(SFOAuth2Token token);
    public void onError(SFSDKException exception);
}
