package findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleELement_Refence_Exception {

	public static void main(String[] args) 
	{
		
		

		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	
		WebElement Email_Editbox=driver.findElement(By.id("email"));
		driver.navigate().refresh();
		Email_Editbox.sendKeys("HYD");
		
		
		/*
		 * We get staleelemetreference exception when variable is expired
		 * 	
		 * When variable is expired:-->
		 * 			=> When Page navigated / Refershed...
		 * 		
		 */
	}

}
