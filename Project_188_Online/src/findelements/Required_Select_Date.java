package findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class Required_Select_Date {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		WebElement Date_picker=driver.findElement(By.xpath("//input[contains(@id,'ctl00_mainContent_view_date1')]"));
		Date_picker.click();
		
		
		//Iterate for number of months
		for (int i = 0; i < 9; i++) 
		{
			
			
			WebElement Month1_title_loc=driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]"));
			WebElement Month2_title_loc=driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[2]"));
			
			//Read Runtime Header
			String Month1_title=Month1_title_loc.getText();
			String Month2_title=Month2_title_loc.getText();
			
			String Exp_month="June 2021";
			String Exp_date="6";
			
			
			if(Month1_title.equals(Exp_month))
			{
				driver.findElement(By.linkText(Exp_date)).click();
				break;
			}
			
			
			if(Month2_title.equals(Exp_month))
			{
				WebElement Second_Table=driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar'])[2]"));
				Second_Table.findElement(By.linkText(Exp_date)).click();
				break;
			}
			
			
			WebElement Next_btn=driver.findElement(By.xpath("//span[contains(.,'Next')]"));
			Next_btn.click();
			Thread.sleep(2000);
			
		}
		
		
		
		
		
		

	}

}
