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
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div/div/div/div/div/form/table/tbody/tr[2]/td/input")
	static WebElement LoginInput;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div/div/div/div/div/form/table/tbody/tr[2]/td[2]/input")
	static WebElement PassWordInput;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div/div/div/div/div/form/table/tbody/tr[2]/td[3]/label/input")
	static WebElement LogIn_Button;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div/div/div/div/div/ul/li[7]/a/div")
	static WebElement Elipses;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div/div/div/div/div/ul/li[7]/div/div[2]/ul/li[10]/form/label")
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
		LoginInput.sendKeys();
	}
	
	public void passwordInput()
	{
		PassWordInput.sendKeys();
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
