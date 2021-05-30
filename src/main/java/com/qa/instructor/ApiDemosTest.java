package com.qa.instructor;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ApiDemosTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "may23");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.github.axet.android.apis");
		cap.setCapability("appActivity", "com.github.axet.android.apis.ApiDemos");
		
		//Server Details ==> AndroidDriver(URL of server:port)
		
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	
	    driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	     
	     Thread.sleep(2000);
	     
	     // Test step2 : Click on Advance preference
	     
	     driver.findElementByXPath("//*[@text='3. Preference dependencies']").click();
	     
	     Thread.sleep(2000);
			
	     // TestStep 3
	     
	     //driver.findElementById("android:id/checkbox").click();
	     //OR
	     
	     driver.findElementByXPath("//*[@resource-id='android:id/checkbox']").click();
	     
	     Thread.sleep(2000);
	     
	     //Test Step 4:
	     
	     driver.findElementByXPath("//*[@text='WiFi settings']").click();
	     
	     Thread.sleep(2000);
	     driver.findElementById("android:id/edit").sendKeys("sonal");
	     Thread.sleep(2000);
	     
	     driver.findElementById("android:id/button1").click();
	     
	}

}
