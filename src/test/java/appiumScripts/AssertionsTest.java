package appiumScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AssertionsTest {
	
	AndroidDriver<MobileElement> driver;
	public static	String dest;

		@BeforeClass
		public void Setup() throws MalformedURLException
		{
	DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability("deviceName", "March20121");
			cap.setCapability("platformName", "ANDROID");
			cap.setCapability("platformVersion", "6.0");
			cap.setCapability("appPackage", "com.hostelworld.app");
			cap.setCapability("appActivity", "com.hostelworld.app.feature.common.view.BottomNavBaseActivity");
			
			//Server Details ==> AndroidDriver(URL of server:port)
			
			 driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4724/wd/hub"),cap);
						
		}
		
		@Test(priority='1')
public void destination() throws InterruptedException
{
			driver.findElementByXPath("//*[@resource-id='com.hostelworld.app:id/searchBoxDestinationTv']").click();
			
			Thread.sleep(3000);
			
			driver.findElementByXPath("//*[@resource-id='com.hostelworld.app:id/suggestionEt']").sendKeys("New York");
			
			Thread.sleep(7000);
			
		List<MobileElement> results	=driver.findElementsByXPath("//*[@class='androidx.recyclerview.widget.RecyclerView']/descendant::*");
			
			
		// compare text - London, England among the list of values	
		// if the text matches , click on it
			for(MobileElement temp: results)
			{
				System.out.println(temp.getText());
				if(temp.getText().contains("New York"))
				{
					temp.click();
					break;
				}
			}
			
		Thread.sleep(3000);	
		
}
		
		@Test(priority='2')
		public void searchboxTest() throws InterruptedException
		{
			Thread.sleep(3000);
			dest = driver.findElementByXPath("//*[@resource-id='com.hostelworld.app:id/searchBoxDestinationTv']").getAttribute("text");
					
			System.out.println(dest);

		}
		

		@Test(priority='3')
		public void ValidateDest()
		{
			// Hard Assertions
			
			//Assert.assertEquals(dest, "New York, USA","text didnot match");
			
			SoftAssert sf = new SoftAssert();
			sf.assertEquals(dest, "New York, US","text didnot match");
			sf.assertAll();
			
		}	
		@Test(priority='4')
		public void serchbuttonClick()
		{
			driver.findElementByXPath("//*[@resource-id='com.hostelworld.app:id/searchButton']").click();
		}
		
}
