package testNgScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ApiDemosRealTest {

	AndroidDriver<MobileElement> driver;
	
	@Parameters({"deviceName","Version","URL"})
	@Test(priority='1')
	public void setup(String deviceName,String Version, String URL) throws MalformedURLException
	{
	DesiredCapabilities cap = new DesiredCapabilities();
	
	cap.setCapability("deviceName",deviceName );
	cap.setCapability("platformName", "ANDROID");
	cap.setCapability("platformVersion", Version);
	cap.setCapability("appPackage", "com.github.axet.android.apis");
	cap.setCapability("appActivity", "com.github.axet.android.apis.ApiDemos");
	
	
AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL(URL),cap);
	}
	
	@Test(priority='2')
	public void ApiDemosTest() throws InterruptedException
	{
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		Thread.sleep(3000);
		
		driver.findElementById("android:id/checkbox").click();
		Thread.sleep(3000);
		
		driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
		Thread.sleep(3000);
		
		driver.findElementById("android:id/edit").sendKeys("Appium");
		Thread.sleep(3000);
		
		driver.findElementById("android:id/button1").click();
	}
	
	
	
	
	
	
	
	

}
