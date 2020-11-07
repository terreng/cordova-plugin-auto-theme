package com.terrengurule.autotheme;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.LOG;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.os.Process;

public class AutoTheme extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
            
        if (action.equals("getTheme")) {
			
            callbackContext.success(1);

            return true;

        } else {
			
			return false;
			
		}
    }
	
}