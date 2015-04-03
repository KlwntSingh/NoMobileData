package com.klwnt.nomobiledata;

import com.klwnt.nomobiledata.R;
import com.klwnt.nomobiledata.R.layout;

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

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
	
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        
//	        final ComponentName receiver = new ComponentName(this, NetworkCheckReceiver.class);
//	        final PackageManager pm = this.getPackageManager();
//
//	        
//	        
//	        ToggleButton toggle = (ToggleButton) findViewById(R.id.switch1);
//	        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//	            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//	                if (isChecked) {
//	                	pm.setComponentEnabledSetting(receiver, 
//	              	          PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
//	              	          PackageManager.DONT_KILL_APP);
//	                } else {
//	                	pm.setComponentEnabledSetting(receiver, 
//	              	          PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
//	              	          PackageManager.DONT_KILL_APP);
//	                }
//	            }
//	        });
	        
//	        registerReceiver(new NetworkCheckReceiver(), new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED));
	    //    WifiManager wifimanager=(WifiManager)this.getSystemService(Context.WIFI_SERVICE);
			//wifimanager.setWifiEnabled(false);
	      //  Settings.System.putInt(getContentResolver(), Settings.System.RADIO_WIFI, 0);
	      // Intent it=new Intent("com.example.nomobiledata.MobileDataService");
	      // startService(it);
	    //    Intent serviceIntent = new Intent(this, MobileDataService.class);
	      //  startService(serviceIntent);
	 }
}
