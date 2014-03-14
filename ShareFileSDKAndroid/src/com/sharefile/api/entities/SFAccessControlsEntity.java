
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

package com.sharefile.api.entities;

import com.sharefile.api.SFApiQuery;
import com.sharefile.api.enumerations.SFHttpMethod;
import com.sharefile.api.exceptions.SFToDoReminderException;
import com.sharefile.api.models.SFAccessControl;
import com.sharefile.api.models.SFODataFeed;

public class SFAccessControlsEntity extends SFODataEntityBase
{
    /**
	* Get AccessControl by ID
	* Retrieves a single Access Control entry for a given Item and Principal
	* @param principalid 	
	* @param itemid 	
	* @return A single AccessControl object matching the query
    */
	public static SFApiQuery<SFAccessControl> get(String principalid, String itemid)
	{
		SFApiQuery<SFAccessControl> query = new SFApiQuery<SFAccessControl>();
		query.setFrom("AccessControls");
		query.addIds("principalid", principalid);
		query.addIds("itemid", itemid);
		query.setHttpMethod(SFHttpMethod.GET);
		return query;
	}

    /**
	* Get AccessControl List By Item
	* Retrieves the Access Control List for a given Item.
	* @param id 	
	* @return Access Control List of the given object ID.
    */
	public SFApiQuery<SFODataFeed<SFAccessControl>> getByItem(String id)
	{
		SFApiQuery<SFODataFeed<SFAccessControl>> query = new SFApiQuery<SFODataFeed<SFAccessControl>>();
		query.setFrom("Items");
		query.setAction("AccessControls");
		query.setId(id);
		query.setHttpMethod(SFHttpMethod.GET);
		return query;
	}

    /**
	* Create AccessControl
    * {
    * "Principal":{"url":"https://account.sf-api.com/v3/Groups(id)"},
    * "CanUpload":true,
    * "CanDownload":true,
    * "CanView":true,
    * "CanDelete":true,
    * "CanManagePermissions":true,
    * 
    * "Message":"Message"
    * }
	* Creates a new Access Controls entry for a given Item. Access controls can only define a single Principal,
	* which can be either a Group or User. The 'Principal' element is specified as an object - you should populate
	* either the URL or the ID reference.
	* @param id 	
	* @param accessControl 	
	* @param recursive 	
	* @param message 	
	* @param sendDefaultNotification 	
	* @return the created or modified AccessControl instance
    */
	public SFApiQuery<SFAccessControl> createByItem(String id, SFAccessControl accessControl, Boolean recursive , Boolean sendDefaultNotification)
	{
		SFApiQuery<SFAccessControl> query = new SFApiQuery<SFAccessControl>();
		query.setFrom("Items");
		query.setAction("AccessControls");
		query.setId(id);
		query.addQueryString("recursive", recursive);
		query.addQueryString("sendDefaultNotification", sendDefaultNotification);
		//accessControl.Properties["message"] = message;
		SFToDoReminderException.throwTODOException("handle parameter filing here");
		query.setBody(accessControl);
		query.setHttpMethod(SFHttpMethod.POST);
		return query;
	}

    /**
	* Update AccessControl
    * {
    * "Principal":{"Email":"user@domain.com"},
    * "CanUpload":true,
    * "CanDownload":true,
    * "CanView":true,
    * "CanDelete":true,
    * "CanManagePermissions":true
    * }
	* Updates an existing Access Controls of a given Item. The Principal element cannot be modified, it is provided
	* in the Body to identity the AccessControl element to be modified. You can provide an ID, Email or URL on the
	* Principal object.
	* @param id 	
	* @param accessControl 	
	* @param recursive 	
	* @return the created or modified AccessControl instance
    */
	public SFApiQuery<SFAccessControl> updateByItem(String id, SFAccessControl accessControl, Boolean recursive)
	{
		SFApiQuery<SFAccessControl> query = new SFApiQuery<SFAccessControl>();
		query.setFrom("Items");
		query.setAction("AccessControls");
		query.setId(id);
		query.addQueryString("recursive", recursive);
		query.setBody(accessControl);
		query.setHttpMethod(SFHttpMethod.POST);
		return query;
	}

    /**
	* Delete AccessControl
	* Deletes an AccessControl entry by itemID and principalID. This method does not return any object, a 204 (No Content)
	* response indicates success.
	* @param principalid 	
	* @param itemid 	
    */
	public SFApiQuery delete(String principalid, String itemid)
	{
		SFApiQuery query = new SFApiQuery();
		query.setFrom("AccessControls");
		query.addIds("principalid", principalid);
		query.addIds("itemid", itemid);
		query.setHttpMethod(SFHttpMethod.DELETE);
		return query;
	}

}

