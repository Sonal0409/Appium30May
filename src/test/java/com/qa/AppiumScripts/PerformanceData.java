package com.qa.AppiumScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class PerformanceData {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "443418ec");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.google.android.apps.maps");
		cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
		
		
	AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4733/wd/hub"),cap);
	

	TouchAction t = new TouchAction(driver);
	
	t.tap(PointOption.point(242,953)).perform();
	
	Thread.sleep(2000);
	
	t.press(PointOption.point(242,953)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
	.moveTo(PointOption.point(603,439)).release().perform();
	
	
	List<String> li= driver.getSupportedPerformanceDataTypes();
	
	System.out.println(li);
	
	System.out.println(driver.getPerformanceData("com.google.android.apps.maps","cpuinfo",5));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
