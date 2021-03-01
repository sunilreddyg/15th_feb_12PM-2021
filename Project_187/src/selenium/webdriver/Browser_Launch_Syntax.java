package selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch_Syntax {

	public static void main(String[] args) 
	{
		//Setting Runtime environment variable for chrome driver
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //launch Browser
		driver.get("http://facebook.com");		//Load webpage
		driver.manage().window().maximize();		
		
		/*
		 * Exceptions:-->
		 * 	=>  WebDriver driver=new ChromeDriver();
		 * 		
		 * 		IllegalStateException:-->
		 * 			When Chromdriver.exe file not located
		 * 			under current system.
		 * 
		 * 	=> driver.get("http://google.com");
		 * 		
		 * 		SessionNotCreated:-->
		 * 			Exception display when browserdriver
		 * 			version mismatch with browser version.
		 * 
		 * 		InvalidArgumentException:-->
		 * 			When Url defined without http:// or https://
		 * 	
		 * 			Invalid:-->    driver.get("www.google.com");
		 * 			Valid:---->	   driver.get("http://google.com");
		 */
		

	}

}
