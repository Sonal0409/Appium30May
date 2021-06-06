package com.qa.AppiumScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class NetworkManagement {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "443418ec");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.google.android.apps.maps");
		cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
		
		
	AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4733/wd/hub"),cap);
	
	Boolean wifi=driver.getConnection().isWiFiEnabled();
	
	System.out.println(" IS wifi enabled or not : "+ wifi);
	
	driver.toggleWifi();
	
	boolean data=driver.getConnection().isDataEnabled();
	
	System.out.println(" IS data enabled or not : "+ data);
	
	driver.toggleData();
	
	
	boolean airplane= driver.getConnection().isAirplaneModeEnabled();
	
	System.out.println("Is airplane more enabled or not"+ airplane);
	
	driver.toggleAirplaneMode();
	
	
	
	
	
	
	
	
	}

}
