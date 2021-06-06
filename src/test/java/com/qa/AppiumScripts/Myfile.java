package com.qa.AppiumScripts;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Myfile {
	
	@BeforeSuite
	public void StartAppiumServer()
	{
		System.out.println("Start Server");
	}
	
	@BeforeClass
	public void appTest1()
	{
		System.out.println("Open yahoo app");
	}
	
	@Test(priority='1')
	public void CreateEmail()
	{
		System.out.println("Test code to compose a mail");
	}
	@Test(priority='2')
	public void ModifyEmail()
	{
		System.out.println("Test code to Modify a mail");
	}
	@Test(priority='3')
	public void DeleteEmail()
	{
		System.out.println("Test code to Delete a mail");
	}
	
	@AfterSuite
	public void StopAppiumServer()
	{
		System.out.println("Stop Server");
	}

}
