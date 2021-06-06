package com.qa.AppiumScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Notifications {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "443418ec");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.google.android.apps.maps");
		cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
		
		
	AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4733/wd/hub"),cap);
	
		driver.openNotifications();
		
		Thread.sleep(3000);
		
		
	//	driver.findElementByXPath("//android.widget.Button[@resource-id='android:id/action0']").click();
		
		
		driver.lockDevice();
		
		Thread.sleep(2000);
		
		driver.unlockDevice();
		
		Thread.sleep(2000);
		
		driver.rotate(ScreenOrientation.LANDSCAPE);
		
		
		Thread.sleep(2000);
		
		driver.rotate(ScreenOrientation.PORTRAIT);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
