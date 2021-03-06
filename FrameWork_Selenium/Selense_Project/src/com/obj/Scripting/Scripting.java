package com.obj.Scripting;

import org.testng.annotations.Test;

//import com.obj.InvokeBrowser.Browse;
import com.obj.InvokeBrowser.Browser;
///import com.obj.InvokeBrowser.Browser;
import com.obj.LoginSection.LoginBlock;

public class Scripting extends Browser

{
	@Test(priority =1)
	public void loginlink() throws InterruptedException
	{
		
		LoginBlock L = new LoginBlock(driver);
		
		L.LoginLink();
		
		Thread.sleep(4000);
		
	}
	
	@Test(priority =2)
	public void LoginInput() throws InterruptedException
	{
		LoginBlock L = new LoginBlock(driver);
		
		L.LoginInput();
		
		Thread.sleep(2000);
		
	}
	
	@Test(priority =3)
	public void PasswordInput() throws InterruptedException
	{
		LoginBlock L = new LoginBlock(driver);
		
		L.passwordInput();
		
		Thread.sleep(2000);
		
	}
	
	@Test(priority =4)
	public void Loginclick() throws InterruptedException
	{
		LoginBlock L = new LoginBlock(driver);
		
		L.LogIn_Button();
		
		Thread.sleep(2000);
		
	}
	
	@Test(priority =5)
	public void Elipse() throws InterruptedException
	{
		LoginBlock l = new LoginBlock(driver);
		
		l.Elipse();
		
		Thread.sleep(3000);
	}
	
	@Test(priority =6)
	public void LoggingOut() throws InterruptedException
	{
		LoginBlock l = new LoginBlock(driver);
		
		l.Logout();
	}
}

