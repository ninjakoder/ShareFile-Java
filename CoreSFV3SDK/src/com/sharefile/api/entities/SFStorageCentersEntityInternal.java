
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

import java.net.URI;
import java.util.ArrayList;

import com.sharefile.api.interfaces.ISFQuery;
import com.sharefile.api.models.SFMetadata;
import com.sharefile.api.models.SFODataFeed;
import com.sharefile.api.models.SFQuery;
import com.sharefile.api.models.SFStorageCenter;

public class SFStorageCentersEntityInternal extends SFODataEntityBase
{
    /**
	* Get Storage Center
	* @param url 	
	* @return A single Storage Center
    */
	public ISFQuery<SFStorageCenter> get(URI url)
	{
		ISFQuery<SFStorageCenter> sfApiQuery = new SFQuery<SFStorageCenter>();
		sfApiQuery.setFrom("StorageCenters");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Patch Storage Center
    * {
    * "ExternalAddress":"https://server/",
    * "Version":"4.12.20",
    * "HostName":"hostname" }
	* @param url 	
	* @param sc 	
	* @return Modified Storage Center
    */
	public ISFQuery<SFStorageCenter> update(URI url, SFStorageCenter sc)
	{
		ISFQuery<SFStorageCenter> sfApiQuery = new SFQuery<SFStorageCenter>();
		sfApiQuery.setFrom("StorageCenters");
		sfApiQuery.addIds(url);
		sfApiQuery.setBody(sc);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

    /**
	* Delete Storage Center
	* @param url 	
    */
	public ISFQuery delete(URI url)
	{
		ISFQuery sfApiQuery = new SFQuery();
		sfApiQuery.setFrom("StorageCenters");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

    /**
	* Get List of StorageCenters from Zone
	* Lists Storage Centers of a given Zone
	* @param url 	
	* @return A list of Storage Centers associated with the provided zone
    */
	public ISFQuery<SFODataFeed<SFStorageCenter>> getByZone(URI url)
	{
		ISFQuery<SFODataFeed<SFStorageCenter>> sfApiQuery = new SFQuery<SFODataFeed<SFStorageCenter>>();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.setAction("StorageCenters");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Create StorageCenter
    * {
    * "ExternalAddress":"https://server/",
    * "Version":"4.12.20",
    * "HostName":"hostname"
    * }
	* Creates a new Storage Center associated with a specific zone
	* @param url 	
	* @param storageCenter 	
	* @return The new storage center
    */
	public ISFQuery<SFStorageCenter> createByZone(URI url, SFStorageCenter storageCenter)
	{
		ISFQuery<SFStorageCenter> sfApiQuery = new SFQuery<SFStorageCenter>();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.setAction("StorageCenters");
		sfApiQuery.addIds(url);
		sfApiQuery.setBody(storageCenter);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Update StorageCenter
    * {
    * "ExternalAddress":"https://server/",
    * "Version":"4.12.20",
    * "HostName":"hostname"
    * }
	* Updates an existing Storage Center
	* @param zUrl 	
	* @param scid 	
	* @param storageCenter 	
	* @return the modified storage center
    */
	public ISFQuery<SFStorageCenter> updateByZone(URI zUrl, String scid, SFStorageCenter storageCenter)
	{
		ISFQuery<SFStorageCenter> sfApiQuery = new SFQuery<SFStorageCenter>();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.setAction("StorageCenters");
		sfApiQuery.addIds(zUrl);
		sfApiQuery.addActionIds(scid);
		sfApiQuery.setBody(storageCenter);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

    /**
	* Delete StorageCenter
	* Removes an existing storage center
	* @param zUrl 	
	* @param scid 	
    */
	public ISFQuery deleteByZone(URI zUrl, String scid)
	{
		ISFQuery sfApiQuery = new SFQuery();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.setAction("StorageCenters");
		sfApiQuery.addIds(zUrl);
		sfApiQuery.addActionIds(scid);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

    /**
	* Get StorageCenter Metadata
	* Gets metadata associated with the specified storage center
	* @param zUrl 	
	* @param scid 	
	* @return the storage center metadata feed
    */
	public ISFQuery<SFODataFeed<SFMetadata>> getMetadata(URI zUrl, String scid)
	{
		ISFQuery<SFODataFeed<SFMetadata>> sfApiQuery = new SFQuery<SFODataFeed<SFMetadata>>();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.setAction("StorageCenters");
		sfApiQuery.addIds(zUrl);
		sfApiQuery.addActionIds(scid);
		sfApiQuery.addSubAction("Metadata");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Create or update StorageCenter Metadata
    * [
    * {"Name":"metadataName1", "Value":"metadataValue1", "IsPublic":"true"},
    * {"Name":"metadataName2", "Value":"metadataValue2", "IsPublic":"false"},
    * ...
    * ]
	* Creates or updates Metadata entries associated with the specified storage center
	* @param zUrl 	
	* @param scid 	
	* @param metadata 	
	* @return the storage center metadata feed
    */
	public ISFQuery<SFODataFeed<SFMetadata>> createMetadata(URI zUrl, String scid, ArrayList<SFMetadata> metadata)
	{
		ISFQuery<SFODataFeed<SFMetadata>> sfApiQuery = new SFQuery<SFODataFeed<SFMetadata>>();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.setAction("StorageCenters");
		sfApiQuery.addIds(zUrl);
		sfApiQuery.addActionIds(scid);
		sfApiQuery.addSubAction("Metadata");
		sfApiQuery.setBody(metadata);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Delete StorageCenter Metadata
	* Delete the Metadata entry associated with the specified storage center
	* @param zUrl 	
	* @param scid 	
	* @param name 	
	* @return no data on success
    */
	public ISFQuery deleteMetadata(URI zUrl, String scid, String name)
	{
		ISFQuery sfApiQuery = new SFQuery();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.setAction("StorageCenters");
		sfApiQuery.addIds(zUrl);
		sfApiQuery.addActionIds(scid);
		sfApiQuery.addSubAction("Metadata");
		sfApiQuery.addQueryString("name", name);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

}

