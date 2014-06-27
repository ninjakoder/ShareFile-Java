
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

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;
import com.sharefile.api.models.*;

public class SFMobileSecuritySettings extends SFODataObject {

	@SerializedName("PoisonPillInterval")
	private Integer PoisonPillInterval;
	@SerializedName("EnableOpenExternal")
	private Boolean EnableOpenExternal;
	@SerializedName("EnableOfflineCache")
	private Boolean EnableOfflineCache;
	@SerializedName("EnableAutoLogin")
	private Boolean EnableAutoLogin;
	@SerializedName("RestrictModifiedDevices")
	private Boolean RestrictModifiedDevices;
	@SerializedName("PinLockType")
	private SFSafeEnum<SFPinLockType> PinLockType;

	public Integer getPoisonPillInterval() {
		return PoisonPillInterval;
	}

	public void setPoisonPillInterval(Integer poisonpillinterval) {
		PoisonPillInterval = poisonpillinterval;
	}
	public Boolean getEnableOpenExternal() {
		return EnableOpenExternal;
	}

	public void setEnableOpenExternal(Boolean enableopenexternal) {
		EnableOpenExternal = enableopenexternal;
	}
	public Boolean getEnableOfflineCache() {
		return EnableOfflineCache;
	}

	public void setEnableOfflineCache(Boolean enableofflinecache) {
		EnableOfflineCache = enableofflinecache;
	}
	public Boolean getEnableAutoLogin() {
		return EnableAutoLogin;
	}

	public void setEnableAutoLogin(Boolean enableautologin) {
		EnableAutoLogin = enableautologin;
	}
	public Boolean getRestrictModifiedDevices() {
		return RestrictModifiedDevices;
	}

	public void setRestrictModifiedDevices(Boolean restrictmodifieddevices) {
		RestrictModifiedDevices = restrictmodifieddevices;
	}
	public SFSafeEnum<SFPinLockType> getPinLockType() {
		return PinLockType;
	}

	public void setPinLockType(SFSafeEnum<SFPinLockType> pinlocktype) {
		PinLockType = pinlocktype;
	}

}