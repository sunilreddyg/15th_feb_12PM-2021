package ui_verifactioncommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//driver.manage().window().maximize();
		
		WebElement login_bot=driver.findElement(By.id("ctl00_HyperLinkLogin"));
		
		//Get Selected element x and y corrdinates
		int obj_x=login_bot.getLocation().getX();
		int obj_y=login_bot.getLocation().getY();
		
		System.out.println("object x coordinates are --> "+obj_x);
		System.out.println("object y coordinates are --> "+obj_y);
		
		
		if(obj_x > 1000  && obj_y < 100)
		{
			System.out.println("object presented at top right window");
		}
		else
		{
			System.out.println("object not presented at top right window");
		}
		
		
		
		/*
		 * FAQ:--> how to verify object visible at webpage using x and y coordinates
		 * 		Note:--> When object not visible at webpage x and y coordinates return 0
		 */
		if(obj_x > 0)
		{
			System.out.println("object visible webpage");
		}
		else
		{
			System.out.println("object is not visible at webpage");
		}
		
		
		
		
		
	}

}
