package java_tut;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

	public class Check_404 
	{
		public static void main(String[] args)
		{
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();

		//Get all the links displayed on Page

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		//Verify there are forty five links displayed on the page

		Assert.assertEquals(45, links.size());

		//Iterate though the list of links and print

		//target for each link

		for(WebElement link : links)

		System.out.println(link.getAttribute("href"));				
		
	}

}

