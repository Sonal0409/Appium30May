package com.qa.AppiumScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TestScrollUpandDown {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
DesiredCapabilities	cap= new DesiredCapabilities();
		
	    cap.setCapability("deviceName", "443418ec");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.github.axet.android.apis");
		cap.setCapability("appActivity", "com.github.axet.android.apis.ApiDemos");
			
		// we need to provide the path of Server to the script
		// http://127.0.0.1:4723/wd/hub
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

Thread.sleep(2000);
		
		ScrollUtil.scrollUp(2,driver);
		
		Thread.sleep(2000);
		
		ScrollUtil.scrollDown(1,driver);
		
	
		Thread.sleep(5000);
		driver.quit();
				
	
		
	}
	
	
}
