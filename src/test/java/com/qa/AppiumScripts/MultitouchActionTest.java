package com.qa.AppiumScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class MultitouchActionTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability("deviceName", "443418ec");
			cap.setCapability("platformName", "ANDROID");
			cap.setCapability("platformVersion", "8.1.0");
			cap.setCapability("appPackage", "com.google.android.apps.maps");
			cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
			
			
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4733/wd/hub"),cap);
		

		// 1st finger action
		
		TouchAction t1 = new TouchAction(driver);
		
	t1.press(PointOption.point(570, 790)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
	.moveTo(PointOption.point(845,350)).release();
	
	//Action simulation for Thumb
	
	TouchAction t2 = new TouchAction(driver);
		
		
		t2.press(PointOption.point(410, 1579)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		.moveTo(PointOption.point(180,1480)).release();
		
	
		MultiTouchAction m1= new MultiTouchAction(driver);
		
		m1.add(t1).add(t2).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
