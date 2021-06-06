package testNgScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HostelWorldTest {

	AndroidDriver<MobileElement> driver;
	
	
	@Parameters({"deviceName","Version","URL"})
	@Test
	public void setUpEmulator(String deviceName,String Version, String URL) throws MalformedURLException
	{
DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName",deviceName );
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", Version);
		cap.setCapability("appPackage", "com.hostelworld.app");
		cap.setCapability("appActivity", "com.hostelworld.app.feature.common.view.BottomNavBaseActivity");
		
		driver= new AndroidDriver<MobileElement>(new URL(URL),cap);
	
	}
	
	@Test(priority='1')
	public void TestSearch() throws InterruptedException
	{
		Reporter.log("Started execution of Search button",true);
		
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
	}
	
	@Test(priority='2')
	public void destinationTest() throws InterruptedException
	{
		Reporter.log("Started execution of Destination Test",true);
		
		Thread.sleep(3000);
		
		String text1=driver.findElementById("com.hostelworld.app:id/searchBoxDestinationTv").getAttribute("text");
		
		System.out.println(text1);
		
		//Assert.assertEquals("London, England", "London,Englans","destination donot match");
		Reporter.log("Started execution of Assertion",true);
		SoftAssert sf = new SoftAssert();
		sf.assertEquals("London, England", "London","destination donot match");
		sf.assertAll();
	}
	
	@Test(priority='3')
	public void SearchbuttonClick()

	{
		Reporter.log("Started execution of Search button Click",true);
		driver.findElementById("com.hostelworld.app:id/searchButton").click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
