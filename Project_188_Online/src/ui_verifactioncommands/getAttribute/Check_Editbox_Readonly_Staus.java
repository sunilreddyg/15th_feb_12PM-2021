package ui_verifactioncommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Editbox_Readonly_Staus {

	public static void main(String[] args) 
	{
		
		/*
		 * Scenario: Verifying departure readonly state
		 * 		Given site url is "http://makemytrip.com"
		 * 		Then verify departure editbox is readonly
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		
	
		WebElement Departure_Date=driver.findElement(By.id("departure"));
		String Status=Departure_Date.getAttribute("readonly");
		if(Status.equals("true"))
		{
			System.out.println("Testpass, Departure editbox is in readonly mode");
		}
		else
		{
			System.out.println("Testfail, Departure edibox is writable mode");
		}

	}

}
