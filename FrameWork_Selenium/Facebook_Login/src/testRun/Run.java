package testRun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Run 
{
	public WebDriver driver;

	@BeforeTest
	public void RunBrowser()
	{
		driver = new FirefoxDriver();		
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void StopRun()
	{
		driver.close();
	}

}
