package ui_verifactioncommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Page_Title_At_Webpage {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		
		//Store Expected tilte into reference variable
		String exp_title="SeleniumHQ Browser Automation";
		
		//Get Current Window Runtime title
		String act_title=driver.getTitle();
		
		
		//Verify equal comparision between two strings
		boolean flag=exp_title.equals(act_title);
		
		
		//write a condition to accept further execution when title match
		if(flag==true)
		{
			System.out.println("Selenium Homepage title verified");
			WebElement Download_link=driver.findElement(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"));
			Download_link.click();
			
				//Nested if condition to verify download page title
				if(driver.getTitle().equals("Downloads"))
				{
					System.out.println("Downloads page title verified");
					WebElement Ruby_Download_link=driver.findElement(By.xpath("//a[@href='http://rubygems.org/gems/selenium-webdriver']"));
					Ruby_Download_link.click();
				}
				else
				{
					System.out.println("Downlaod page title not verified");
				}
			
		}
		else
		{
			System.out.println("Wrong page tilte presented for selenium homepage");
	    }
		
		
		
		/*
		 * Note:--> 
		 * 			Above source code preventing wrong actions to perform on selected
		 * 			elements.
		 */
		
		

	}

}
