
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

import java.util.ArrayList;

public class SFFolder extends SFItem {

	private Integer FileCount;
	private ArrayList<SFItem> Children;
	private SFItemInfo Info;

	public Integer getFileCount() 
	{
		if(FileCount!=null)
		{
			return FileCount;
		}
		
		return 0;
	}

	public void setFileCount(Integer filecount) {
		FileCount = filecount;
	}
	public ArrayList<SFItem> getChildren() {
		return Children;
	}

	public void setChildren(ArrayList<SFItem> children) {
		Children = children;
	}
	public SFItemInfo getInfo() {
		return Info;
	}

	public void setInfo(SFItemInfo info) {
		Info = info;
	}
}