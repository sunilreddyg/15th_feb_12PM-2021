package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPage_Title {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.dev");
		driver.manage().window().maximize();
		
		//Get current page title
		String Runtime_title=driver.getTitle();
		System.out.println("Currnet page title is --> "+Runtime_title);
		
		String Exp_title="SeleniumHQ Browser Automation";
		
		//Conditional statement to verify Expected title presented at webapge
		if(Runtime_title.equals(Exp_title))
		{
			System.out.println("Selenium homepage title verified");
			WebElement Download_link=driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[1]"));
			Download_link.click();
			
			//Condition statement to verify Download page
			if(driver.getTitle().contains("Download"))
				System.out.println("Download page title verified");
			else
				System.out.println("Download page title mismatch");
			
		}
		else
			System.out.println("Wrong title presented for Selenium Homepage");
		
		

	}

}
