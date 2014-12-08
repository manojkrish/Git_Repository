package com.obj.TestScript;

import org.testng.annotations.Test;

import com.obj.InvokeBrowser.Browser;
import com.obj.login.Login;

public class TestScript extends Browser 

{

	@Test(priority =1)
	public void loginlink() throws InterruptedException
	{
		
		Login L = new Login(driver);
		
		L.LoginLink();
		
		Thread.sleep(4000);
		
	}
	
	@Test(priority =2)
	public void LoginInput() throws InterruptedException
	{
		Login L = new Login(driver);
		
		L.LoginInput();
		
		Thread.sleep(2000);
		
	}
	
	@Test(priority =3)
	public void PasswordInput() throws InterruptedException
	{
		Login L = new Login(driver);
		
		L.passwordInput();
		
		Thread.sleep(2000);
		
	}
	
	@Test(priority =4)
	public void Loginclick() throws InterruptedException
	{
		Login L = new Login(driver);
		
		L.LogIn_Button();
		
		Thread.sleep(2000);
		
	}
	
	@Test(priority =5)
	public void Elipse() throws InterruptedException
	{
		Login l = new Login(driver);
		
		l.Elipse();
		
		Thread.sleep(3000);
	}
	
	@Test(priority =6)
	public void LoggingOut() throws InterruptedException
	{
		Login l = new Login(driver);
		
		l.Logout();
	}
}
