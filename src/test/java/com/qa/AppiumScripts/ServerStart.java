package com.qa.AppiumScripts;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class ServerStart {

	public static void main(String[] args) throws MalformedURLException {
	
		//This class is used to build the Appium service, 
		//i.e. you can use this class to set the server address, port, 
		//desired capabilities and other flags before starting the Appium server
		
		AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
		
		// Use any port, in case the default 4723 is already taken (maybe by another Appium server)
		 serviceBuilder.usingAnyFreePort();
		 
		// Tell serviceBuilder where node is installed.
		 serviceBuilder.usingDriverExecutable(new File("C:\\Program Files (x86)\\nodejs\\node.exe"));
		 
		// Tell serviceBuilder where Appium is installed. Or set this path in an environment variable named APPIUM_PATH
	        serviceBuilder.withAppiumJS(new File("C:\\\\Users\\\\vishal mittal\\\\AppData\\\\Local\\\\Programs\\\\Appium\\\\resources\\\\app\\\\node_modules\\\\appium\\\\build\\\\lib\\\\main.js"));

	        AppiumDriverLocalService service = AppiumDriverLocalService.buildService(serviceBuilder);
	        service.start();
	
	        DesiredCapabilities	cap= new DesiredCapabilities();
			
		    cap.setCapability("deviceName", "443418ec");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "8.1.0");
			cap.setCapability("appPackage", "com.github.axet.android.apis");
			cap.setCapability("appActivity", "com.github.axet.android.apis.ApiDemos");
       		AndroidDriver driver= new AndroidDriver(service,cap);
		service.stop();	
	}
	
	
	
	

}
