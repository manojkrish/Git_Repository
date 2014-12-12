package loginpackage;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testRun.Run;
import components.CompElement;

public class Login extends Run

{
	
	WebDriver driver;
		
	@Test(priority =1)
	public void LogoAvail() throws InterruptedException
	{
		
		CompElement CP = new CompElement();
		
		CP.getClass();
		
		System.out.println(CP.getClass());		
	}	
	

}
