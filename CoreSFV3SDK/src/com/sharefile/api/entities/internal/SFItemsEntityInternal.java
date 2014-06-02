
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

package com.sharefile.api.entities.internal;

import com.sharefile.api.entities.SFItemsEntity;
import com.sharefile.api.interfaces.ISFQuery;
import com.sharefile.api.models.SFAdvancedSearchResults;
import com.sharefile.api.models.SFQuery;
import com.sharefile.api.models.SFSearchQuery;
import com.sharefile.api.models.SFSimpleSearchQuery;

public class SFItemsEntityInternal extends SFItemsEntity
{
    /**
	* Advanced Simple Search
    * {
    * "Query":{
    * "AuthID":"",
    * "ItemType":"",
    * "ParentID":"",
    * "CreatorID":"",
    * "LuceneQuery":"",
    * "SearchQuery":"",
    * "CreateStartDate":"",
    * "CreateEndDate":"",
    * "ItemNameOnly":"",
    * },
    * "Paging":{
    * "Key":"",
    * "PageNumber":1,
    * "PageSize":10,
    * },
    * "Sort":{
    * "SortBy":"",
    * "Ascending":false,
    * },
    * "TimeoutInSeconds":10
    * }
	* Search for Items matching the criteria of the query parameter
	* @param simpleSearchQuery 	
	* @return AdvancedSearchResults
    */
	public ISFQuery<SFAdvancedSearchResults> advancedSimpleSearch(SFSimpleSearchQuery simpleSearchQuery)
	{
		ISFQuery<SFAdvancedSearchResults> sfApiQuery = new SFQuery<SFAdvancedSearchResults>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("AdvancedSimpleSearch");
		sfApiQuery.setBody(simpleSearchQuery);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Advanced Search
    * {
    * "Query":{
    * "AuthIDs":["id1", "id2", ...],
    * "ItemTypes":["type1", "type2", ...],
    * "ParentID":["id1", "id2", ...],
    * "CreatorID":["id1", "id2", ...],
    * "LuceneQuery":"",
    * "SearchQuery":"",
    * "CreateStartDate":"",
    * "CreateEndDate":"",
    * "ItemNameOnly":"",
    * },
    * "Paging":{
    * "Key":"",
    * "PageNumber":1,
    * "PageSize":10,
    * },
    * "Sort":{
    * "SortBy":"",
    * "Ascending":false,
    * },
    * "TimeoutInSeconds":10
    * }
	* Search for Items matching the criteria of the query parameter
	* @param searchQuery 	
	* @return AdvancedSearchResults
    */
	public ISFQuery<SFAdvancedSearchResults> advancedSearch(SFSearchQuery searchQuery)
	{
		ISFQuery<SFAdvancedSearchResults> sfApiQuery = new SFQuery<SFAdvancedSearchResults>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("AdvancedSimpleSearch");
		sfApiQuery.setBody(searchQuery);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

}

