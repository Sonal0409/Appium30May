package com.qa.AppiumScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class HybridAppTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "443418ec");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "org.chromium.chrome.browser.ChromeTabbedActivity");
		cap.setCapability("chromedriverExecutable", "C:\\chromedriver.exe");
		cap.setCapability("browserName", "chrome");
		
	AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4733/wd/hub"),cap);
	
	
	driver.findElementById("com.android.chrome:id/terms_accept").click();
	
	Thread.sleep(2000);
	
	driver.findElementById("com.android.chrome:id/next_button").click();
	
	Thread.sleep(2000);
	
	driver.findElementById("com.android.chrome:id/negative_button").click();
	
	Thread.sleep(2000);
	
	driver.findElementByXPath("//android.widget.TextView[@text='Wikipedia']").click();
	
	
	Set<String> cns= driver.getContextHandles();
	
	
	System.out.println(cns +"\n\n");
	
	driver.context("WEBVIEW_chrome");
	
	Thread.sleep(2000);
	
	driver.findElementByXPath("//button[@type='submit']").click();
	
	Thread.sleep(2000);
	
	driver.findElementByXPath("/html/body/div[3]/div/div[1]/div/div[1]/form/input[1]").sendKeys("Appium");
	
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	
	
	Thread.sleep(2000);
	
	
	driver.context("NATIVE_APP");
	
	driver.findElementById("com.android.chrome:id/menu_button").click();
	
	Thread.sleep(2000);
	
	driver.findElementByXPath("//android.widget.TextView[@text='History']").click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
		

	}

}
