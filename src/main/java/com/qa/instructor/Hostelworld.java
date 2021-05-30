package com.qa.instructor;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Hostelworld {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		
		//Added new changes from git hub
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "may23");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.hostelworld.app");
		cap.setCapability("appActivity", ".feature.common.view.BottomNavBaseActivity");
		
		//Server Details ==> AndroidDriver(URL of server:port)
		
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			
	driver.findElementByXPath("//*[@resource-id='com.hostelworld.app:id/searchBoxDestinationTv']").click();
	
	Thread.sleep(3000);
		
	driver.findElementByXPath("//*[@resource-id='com.hostelworld.app:id/suggestionEt']").sendKeys("London");
	
	Thread.sleep(7000);
List<MobileElement> result	=driver.findElementsByXPath("//*[@class='androidx.recyclerview.widget.RecyclerView']//child::*");
	
	// start a loop on results list items and match a string with each item, click on it if item matches

for(MobileElement temp: result)
{
	
	if(temp.getText().contains("London"))
	{
		System.out.println(temp.getText());
		temp.click();
		break;
	}
}
	
Thread.sleep(2000);

driver.findElementByXPath("//*[@resource-id='com.hostelworld.app:id/searchButton']").click();
	
	

	}

}
