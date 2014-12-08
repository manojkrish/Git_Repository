package com.obj.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(how=How.XPATH,using="/html/body/div[8]/div/div/div/ul/li[3]/a")
	static WebElement LoginBlock;
	
	@FindBy(how=How.ID,using="login")
	static WebElement LoginBox;
	
	@FindBy(how=How.ID,using="password")
	static WebElement PasswordBox;
	
	@FindBy(how=How.XPATH,using="/html/body/div[8]/div[2]/div/div/form/fieldset[2]/p[2]/button")
	static WebElement LoginButton;
	
	public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public void clicklogin()
	{
		LoginBlock.click();
	}
	
	public void logininput()
	{
		LoginBox.sendKeys("manoj.ranganathan@globalenglish.com");
	}
	
	public void Passwordinput()
	{
		PasswordBox.sendKeys("madan123$");
	}
	
	public void clickloginbutton()
	{
		LoginButton.click();
	}

}