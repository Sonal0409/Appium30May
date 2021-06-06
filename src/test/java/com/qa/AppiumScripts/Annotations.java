package com.qa.AppiumScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations {
	
	
	@BeforeTest
	public void setup()
	{
		System.out.println("Start the android Device");
	}
	
	@BeforeClass
	public void appTest()
	{
		System.out.println("Open gmail app");
	}
	
	@Parameters({"Username","Password"})
	@Test(priority='1')
	public void loginTest(String Username, String Password)
	{
		System.out.println("Code to login to mail box");
		System.out.println(Username);
		System.out.println(Password);
	}
	
	@Test(priority='2')
	public void CreateEmail()
	{
		System.out.println("Test code to compose a mail");
	}
	@Test(priority='3')
	public void ModifyEmail()
	{
		System.out.println("Test code to Modify a mail");
	}
	@Test(priority='4')
	public void DeleteEmail()
	{
		System.out.println("Test code to Delete a mail");
	}

	@AfterClass
	public void closemethod()
	{
		System.out.println("Close the app");
		System.out.println("lock the phone");
	}
	
}
