package com.klwnt.nomobiledata;

/*
Copyright [2014] KlwntSingh

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.Format.Field;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

public class NetworkCheckReceiver extends BroadcastReceiver {

	
	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		ConnectivityManager cm =
		        (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
		 
		NetworkInfo activeNetwork = cm.getActiveNetworkInfo();

		try {
			if(activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE){
				if(activeNetwork.isAvailable()){
				      try {
				    	  setMobileDataEnabled(context,false);
						//actualworkdoer.setMobileDataEnabled(context, false);
					} catch (ClassNotFoundException | NoSuchFieldException
							| IllegalAccessException | NoSuchMethodException
							| InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}   	
			     }
				
  
			
}
		} catch ( NullPointerException exception) {
//			NO Active Networks
		
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	
}
	public void setMobileDataEnabled(Context context, boolean enabled) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
	    final ConnectivityManager conman = (ConnectivityManager)  context.getSystemService(Context.CONNECTIVITY_SERVICE);
	    final Class conmanClass = Class.forName(conman.getClass().getName());
	    final java.lang.reflect.Field connectivityManagerField = conmanClass.getDeclaredField("mService");
	    connectivityManagerField.setAccessible(true);
	  
	    final Object connectivityManager = connectivityManagerField.get(conman);
	    final Class connectivityManagerClass =  Class.forName(connectivityManager.getClass().getName());
	    final Method setMobileDataEnabledMethod = connectivityManagerClass.getDeclaredMethod("setMobileDataEnabled", Boolean.TYPE);
	    setMobileDataEnabledMethod.setAccessible(true);

	    setMobileDataEnabledMethod.invoke(connectivityManager, enabled);
	}
}