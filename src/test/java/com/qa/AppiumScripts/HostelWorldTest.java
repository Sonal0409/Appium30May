package com.qa.AppiumScripts;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HostelWorldTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "may23");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.hostelworld.app");
		cap.setCapability("appActivity", "com.hostelworld.app.feature.common.view.BottomNavBaseActivity");
		
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4733/wd/hub"),cap);
	
	driver.findElementByXPath("//android.widget.TextView[@resource-id='com.hostelworld.app:id/searchBoxDestinationTv']").click();
	
	Thread.sleep(2000);
	
	driver.findElementByXPath("//android.widget.EditText[@resource-id='com.hostelworld.app:id/suggestionEt']").sendKeys("London");
		
		
	// suggestion list
	
	Thread.sleep(7000);
	
	List<MobileElement> result=driver.findElementsByXPath("//*[@class='androidx.recyclerview.widget.RecyclerView']//child::*");
	
	for(MobileElement temp:result)
	{
		System.out.println(temp.getSize());
		System.out.println(temp.getText());
		
		
		if(temp.getText().contains("London"))
		{
			//System.out.println(temp.getText());
			temp.click();
			break;
		}
	}
	
	Thread.sleep(3000);
	
	String text1=driver.findElementById("com.hostelworld.app:id/searchBoxDestinationTv").getAttribute("text");
	
	System.out.println(text1);
	
	driver.findElementById("com.hostelworld.app:id/searchButton").click();
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
	
	}

}
