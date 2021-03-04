package selenium.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected_Dropdown_Without_Select_Class {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://v1.hdfcbank.com/branch-atm-locator/?lat=");
		driver.manage().window().maximize();
		
		/*
		 * Get Options Xpath And perform click option..
		 */
		driver.findElement(By.xpath("//option[@value='delhi'][contains(.,'Delhi')]")).click();
		
		
	}

}
