
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


import java.util.stream;

public class SFDevicesEntityInternal extends SFDevicesEntity
{
    /**
	* Get Device Users for Current User
	* @return A feed of DeviceUser objects
    */
	public SFApiQuery<SFODataFeed<SFDeviceUser>> get()
	{
		SFApiQuery<SFODataFeed<SFDeviceUser>> query = new SFApiQuery<SFODataFeed<SFDeviceUser>>();
		query.setFrom("Devices");
		query.setHttpMethod("GET");
		return query;
	}

    /**
	* Get Device Users for Current User
	* @return A feed of DeviceUser objects
    */
	public SFApiQuery<SFDevice> get(String id)
	{
		SFApiQuery<SFDevice> query = new SFApiQuery<SFDevice>();
		query.setFrom("Devices");
		query.addIds(id);
		query.setHttpMethod("GET");
		return query;
	}

	public SFApiQuery<SFODataFeed<SFDeviceUser>> getByUser(String userId)
	{
		SFApiQuery<SFODataFeed<SFDeviceUser>> query = new SFApiQuery<SFODataFeed<SFDeviceUser>>();
		query.setFrom("User");
		query.setAction("Devices");
		query.addIds(userId);
		query.setHttpMethod("GET");
		return query;
	}

    /**
	* Delete Device
	* @param id 	
	* @return no data on success
    */
	public SFApiQuery delete(String id)
	{
		SFApiQuery query = new SFApiQuery();
		query.setFrom("Devices");
		query.addIds(id);
		query.setHttpMethod("DELETE");
		return query;
	}

	public SFApiQuery deleteByUser(String userId, String deviceId)
	{
		SFApiQuery query = new SFApiQuery();
		query.setFrom("User");
		query.setAction("Devices");
		query.addIds(userId);
		query.addActionIds(deviceId);
		query.setHttpMethod("DELETE");
		return query;
	}

	public SFApiQuery<SFDeviceUser> createByUser(String userId, String deviceId, SFDeviceUser du)
	{
		SFApiQuery<SFDeviceUser> query = new SFApiQuery<SFDeviceUser>();
		query.setFrom("User");
		query.setAction("Devices");
		query.addIds(userId);
		query.addActionIds(deviceId);
		query.setBody(du);
		query.setHttpMethod("POST");
		return query;
	}

    /**
	* Wipe Device
	* @param deviceID 	
	* @param userid 	
	* @return no data on success
    */
	public SFApiQuery wipe(String deviceID, String userid = null)
	{
		SFApiQuery query = new SFApiQuery();
		query.setFrom("Devices");
		query.setAction("Wipe");
		query.addIds(deviceID);
		query.addQueryString("userid", userid);
		query.setHttpMethod("POST");
		return query;
	}

    /**
	* Signal Wipe Done
    * {
    * "Logs" :
    * [
    * { "FileName":"fileA",
    * "FileID":"id",
    * "Timestamp":0,
    * "AccountID":"id",
    * "UserID":"userId1",
    * "Action":"OpenGeneric",
    * "AdditionalInfo":""
    * },
    * ...
    * ],
    * "WipeResults" :
    * [
    * {"id":"userId1", "WipeToken":"token1", "Success":"true", "ErrorMessage":"" },
    * {"id":"userId1", "WipeToken":"token2", "Success":"false", "ErrorMessage":"some error" },
    * ...
    * ]
    * }
	* Signal that a device wipe has been completed
	* @param deviceID 	
	* @param deviceWipeReport 	
	* @param singlePlane 	
	* @return no data on success
    */
	public SFApiQuery wipeDone(String deviceID, SFDeviceWipeReport deviceWipeReport, Boolean singlePlane = false)
	{
		SFApiQuery query = new SFApiQuery();
		query.setFrom("Devices");
		query.setAction("WipeDone");
		query.addIds(deviceID);
		query.addQueryString("singlePlane", singlePlane);
		query.setBody(deviceWipeReport);
		query.setHttpMethod("POST");
		return query;
	}

    /**
	* Check Device Status
	* @param deviceID 	
	* @return DeviceStatus
    */
	public SFApiQuery<SFDeviceStatus> status(String deviceID)
	{
		SFApiQuery<SFDeviceStatus> query = new SFApiQuery<SFDeviceStatus>();
		query.setFrom("Devices");
		query.setAction("Status");
		query.addIds(deviceID);
		query.setHttpMethod("GET");
		return query;
	}

}
