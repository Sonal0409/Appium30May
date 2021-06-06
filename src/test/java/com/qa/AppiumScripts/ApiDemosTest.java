package com.qa.AppiumScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ApiDemosTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "443418ec");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.github.axet.android.apis");
		cap.setCapability("appActivity", "com.github.axet.android.apis.ApiDemos");
		
		
	AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	// teststep1: click on preference
	
	// locator--> action to be performed
	
	driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	
	Thread.sleep(3000);
	
	driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	Thread.sleep(3000);
	
	//Explicit wait ==> conditions to be satisfied or wait time(5)
	
	MobileElement e= driver.findElementById("android:id/checkbox");
	
	WebDriverWait w = new WebDriverWait(driver, 10);
	w.until(ExpectedConditions.visibilityOf(e));
	
	e.click();
	Thread.sleep(3000);
	
	driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
	Thread.sleep(3000);
	
	driver.findElementById("android:id/edit").sendKeys("Appium");
	Thread.sleep(3000);
	
	driver.findElementById("android:id/button1").click();
	
	//driver.closeApp();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		

	}

}
