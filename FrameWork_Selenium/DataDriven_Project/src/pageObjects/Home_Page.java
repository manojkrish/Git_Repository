package pageObjects;
 
    import org.openqa.selenium.By;
 
    import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
 
 public class Home_Page {
 
    private static WebElement element = null;
 
 public static WebElement lnk_MyAccount(WebDriver driver){
 
    element = driver.findElement(By.id("account"));
 
    return element;
 
    }
 
 public static WebElement lnk_LogOut(WebDriver driver)
 {
 
	/* Actions action = new Actions(driver);
	 
	 WebElement we = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/ul[2]/li/a"));
	
	 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("/html/body/div/div[3]/div/div/ul[2]/li/div/ul/li[3]/a"))).click().build().perform();
    */
	 element = driver.findElement(By.id("account_logout"));
 
	 return element;
 
    }
 
}