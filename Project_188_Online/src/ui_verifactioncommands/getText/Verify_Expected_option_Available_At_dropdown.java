package ui_verifactioncommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Expected_option_Available_At_dropdown {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		WebElement Month_Dropdown=driver.findElement(By.id("month"));
		String Dropdown_text=Month_Dropdown.getText();
		//System.out.println(Dropdown_text);
		
		
		//Decision to verify expected month displayed at dropdown
		if(Dropdown_text.contains("Aug"))
		{
			System.out.println("Testpass, Option visible at dropdown");
		}
		else
		{
			System.out.println("Testfail option not visible at dropdown");
		}
		
		

	}

}
