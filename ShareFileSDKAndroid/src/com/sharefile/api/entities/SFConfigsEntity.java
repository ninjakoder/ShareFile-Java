
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
import com.sharefile.api.models.SFGenericConfig;
import com.sharefile.api.models.SFODataFeed;


public class SFConfigsEntity extends SFODataEntityBase
{
	public SFApiQuery<SFODataFeed<SFGenericConfig>> get()
	{
		SFApiQuery<SFODataFeed<SFGenericConfig>> query = new SFApiQuery<SFODataFeed<SFGenericConfig>>();
		query.setFrom("Configs");
		query.setHttpMethod(SFHttpMethod.GET);
		return query;
	}

}
