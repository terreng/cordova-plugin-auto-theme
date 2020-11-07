package com.terrengurule.autotheme;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.LOG;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.os.Process;

import android.content.res.Configuration;

public class AutoTheme extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
            
        if (action.equals("getTheme")) {
		
		int uiMode = cordova.getActivity().getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
		if (uiMode == Configuration.UI_MODE_NIGHT_YES) {
			callbackContext.success("true");
		} else {
			callbackContext.success("false");
		}

            return true;

        } else {
			
			return false;
			
		}
    }
	
}