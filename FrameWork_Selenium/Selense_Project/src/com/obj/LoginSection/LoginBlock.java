package com.obj.LoginSection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginBlock 
{
	
	@FindBy(how=How.XPATH,using="/html/body/div[8]/div/div/div/ul/li[3]/a")
	static WebElement LoginLink;
	
	@FindBy(how=How.XPATH,using="/html/body/div[8]/div[2]/div/div/form/fieldset/p/span/input")
	static WebElement LoginInput;
	
	@FindBy(how=How.XPATH,using="/html/body/div[8]/div[2]/div/div/form/fieldset/p[2]/input")
	static WebElement PassWordInput;
	
	@FindBy(how=How.XPATH,using="/html/body/div[8]/div[2]/div/div/form/fieldset[2]/p[2]/button")
	static WebElement LogIn_Button;
	
	@FindBy(how=How.XPATH,using="/html/body/header/div[2]/div[4]/ul[2]/li[3]/a/span")
	static WebElement Elipses;
	
	@FindBy(how=How.XPATH,using="/html/body/header/div[2]/div[4]/ul[2]/li[3]/ul/li[9]/a")
	static WebElement Logout;

	public LoginBlock(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void LoginLink()
	{
		LoginLink.click();
	}
	
	public void LoginInput()
	{
		LoginInput.sendKeys("manoj.ranganathan@globalenglish.com");
	}
	
	public void passwordInput()
	{
		PassWordInput.sendKeys("madan123$");
	}
	
	public void LogIn_Button()
	{
		LogIn_Button.click();
	}
	
	public void Elipse()
	{
		Elipses.click();
	}
	
	public void Logout()
	{
		Logout.click();
	}
}
