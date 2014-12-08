package com.obj.InvokeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Browser 

{
	public WebDriver driver;

	
	@BeforeTest
	public void openBrowser()
	{
		
		driver = new FirefoxDriver();
		
		driver.get("http://www.yammer.com");
		
		driver.manage().window().maximize();
		
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		
		
		driver.quit();
		
	}

}
