
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2014 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.sharefile.api.models;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.sharefile.api.constants.SFKeywords;
import com.sharefile.api.exceptions.SFJsonException;
import com.sharefile.api.gson.SFGsonHelper;


public class SFSession extends SFODataObject {

	private SFPrincipal mPrincipal;
	private String mAuthenticationType;
	private String mTool;
	private String mVersion;
	private Boolean mIsAuthenticated;
	private String mName;
	private SFDeviceUser mDeviceUser;

	public SFPrincipal getPrincipal() {
		return mPrincipal;
	}

	public void setPrincipal(SFPrincipal principal) {
		mPrincipal = principal;
	}
	public String getAuthenticationType() {
		return mAuthenticationType;
	}

	public void setAuthenticationType(String authenticationtype) {
		mAuthenticationType = authenticationtype;
	}
	public String getTool() {
		return mTool;
	}

	public void setTool(String tool) {
		mTool = tool;
	}
	public String getVersion() {
		return mVersion;
	}

	public void setVersion(String version) {
		mVersion = version;
	}
	public Boolean getIsAuthenticated() {
		return mIsAuthenticated;
	}

	public void setIsAuthenticated(Boolean isauthenticated) {
		mIsAuthenticated = isauthenticated;
	}
	public String getName() {
		return mName;
	}

	public void setName(String name) {
		mName = name;
	}
	public SFDeviceUser getDeviceUser() {
		return mDeviceUser;
	}

	public void setDeviceUser(SFDeviceUser deviceuser) {
		mDeviceUser = deviceuser;
	}
	
	
	@Override
	public String toJsonString() throws SFJsonException
	{			
		try
        {
			return super.toJsonString();
        }
        catch(JsonSyntaxException ex)
        {
        	throw new SFJsonException(ex);
        }				
	}
	
	@Override
	public void parseFromJson(String jsonString) throws SFJsonException 
	{				        
        try
        {        
        	super.parseFromJson(jsonString);
        	SFGsonHelper.fromJson(jsonString, SFSession.class, new TypeToken<SFSession>(){}.getType(), new SFGsonDeserializer());
        }
        catch(JsonSyntaxException ex)
        {
        	throw new SFJsonException(ex);
        }        		
	}
	
	private class SFGsonDeserializer implements JsonDeserializer<SFODataObject>
	{
		@Override
		public SFODataObject deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext context) throws JsonParseException 
		{			
			JsonObject jsonObject = jsonelement.getAsJsonObject();
			
			mPrincipal = SFGsonHelper.getSFODataObject(SFPrincipal.class, jsonObject, SFKeywords.PRINCIPAL, null);
			mAuthenticationType = SFGsonHelper.getString(jsonObject, SFKeywords.AUTHENTICATION_TYPE, null);
			mTool = SFGsonHelper.getString(jsonObject, SFKeywords.TOOL, null);
			mVersion = SFGsonHelper.getString(jsonObject, SFKeywords.VERSION, null);
			mName = SFGsonHelper.getString(jsonObject, SFKeywords.NAME, null);
			mDeviceUser = SFGsonHelper.getSFODataObject(SFDeviceUser.class, jsonObject, SFKeywords.DEVICE_USER, null);
			mIsAuthenticated = SFGsonHelper.getBoolean(jsonObject, SFKeywords.IS_AUTHENTICATED, false);
			
			return null;
		}		
	}
}