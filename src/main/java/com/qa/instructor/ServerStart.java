package com.qa.instructor;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class ServerStart {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
		 serviceBuilder.usingAnyFreePort();
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
				
			// we need to provide the path of Server to the script
			// http://127.0.0.1:4723/wd/hub
			
			AndroidDriver driver= new AndroidDriver(service,cap);
		service.stop();	
	}

}
