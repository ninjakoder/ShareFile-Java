package com.citrix.sharefile.api.gson.auto;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.citrix.sharefile.api.gson.SFGsonHelper;
import com.citrix.sharefile.api.models.SFGroup;
import com.citrix.sharefile.api.models.SFItem;
import com.citrix.sharefile.api.models.SFODataObject;
import com.citrix.sharefile.api.models.SFShare;
import com.citrix.sharefile.api.models.SFUser;

/**
 *   This class read the odata.metadata from the JsonElement to find out the real type of object contained inside the object 
 *   and the routes the parsing back to the correct default gson parser.
 */
public class SFGsonRouter implements JsonDeserializer<SFODataObject>
{		
	private static final String TAG = "SFGsonRouter";
	
	@Override
	public SFODataObject deserialize(JsonElement jsonElement, Type typeOfObject,JsonDeserializationContext desContext) throws JsonParseException 
	{		
		return SFGsonHelper.customParse(jsonElement);
	}
}