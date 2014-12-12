package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CompElement 
{
	
	//Logo Components
	WebDriver driver;
	
	public void logo()
	{
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/a/i"));
	}
	
	//Login Components
	
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div/div/div/div/div/form/table/tbody/tr/td/label")
	static WebElement Login_Label;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div/div/div/div/div/form/table/tbody/tr[2]/td/input")
	static WebElement Login_inputBox;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div/div/div/div/div/form/table/tbody/tr/td[2]/label")
	static WebElement Password_Label;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div/div/div/div/div/form/table/tbody/tr[2]/td[2]/input")
	static WebElement Password_inputBox;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div/div/div/div/div/form/table/tbody/tr[2]/td[3]/label/input")
	static WebElement Login_Button;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div/div/div/div/div/form/table/tbody/tr[3]/td/div/div/label")
	static WebElement Keep_MeLoggedIn;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div/div/div/div/div/form/table/tbody/tr[3]/td[2]/a")
	static WebElement Forgot_Link;
	
	
	//SignUp Components
	
	
	@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div/div/div/div/div[2]/h1")
	static WebElement Signup_Label;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div/div/div/div/div[2]/h2")
	static WebElement SignupCaption_Label;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div/form/div/div/div/div/div/input")
	static WebElement FirstName_Input;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div/form/div/div/div[2]/div/div/input")
	static WebElement SecondName_Input;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div/form/div/div[2]/div/div/input")
	static WebElement Email_mobileNumber;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div/form/div/div[3]/div/div/input")
	static WebElement ReEnter_EmailorMobile;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div/form/div/div[4]/div/div/input")
	static WebElement NewPassWord;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div/form/div/div[5]/div")
	static WebElement Birthday_Label;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div/form/div/div[5]/div[2]/span/span/select")
	static WebElement Month_DropDown;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div/form/div/div[5]/div[2]/span/span/select[2]")
	static WebElement Day_DropDown;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div/form/div/div[5]/div[2]/span/span/select[3]")
	static WebElement Year_DropDown;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div/form/div/div[6]/span/span/label")
	static WebElement Female_label;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div/form/div/div[6]/span/span[2]/label")
	static WebElement Male_label;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div/form/div/div[8]/button")
	static WebElement SignUp_button;
	
	
}

