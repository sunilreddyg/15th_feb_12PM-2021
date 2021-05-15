package ui_validation_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsDisplayed_For_Static_Elements 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https://www.outlook.com");  
		driver.manage().window().maximize();    
								
	
		//Identify Signin button [even hidden /visible object identification is same]
		WebElement Signin_btn=driver.findElement(By.xpath("//a[text()='Sign in']"));
		
		if(Signin_btn.isDisplayed())
		{
			System.out.println("expected Element visible at webpage");
			Signin_btn.click();
		}
		else
			System.out.println("Signin button not visible at webpage");

		
		//COndition to verify Email object is visble and enable before perform action
		WebElement Email_EB=driver.findElement(By.id("i0116"));
		if(Email_EB.isDisplayed() && Email_EB.isEnabled())
		{
			Email_EB.clear();
			Email_EB.sendKeys("sunilreddy.gajjala@outlook.com");
		}
		else
			System.out.println("Email editbox is not visible at webpage");
		
		
		//COndition to verify password object is visble and enable before perform action
		Thread.sleep(4000);
		WebElement Password_EB=driver.findElement(By.xpath("//input[@id='i0118']"));
		if(Password_EB.isDisplayed() &&  Password_EB.isEnabled())
		{
			Password_EB.clear();
			Password_EB.sendKeys("MyPWD100");
		}
		else
		{
			System.out.println("object not visible at webpage");
		}
		
		
		/*
		 * 
		 * These expections present when user perform action on Hidden and Disable element
		 * 
		 * ElementNotvisibleException   
		 * 			==> It Throws When user perform action on hidden element  
		 * InvalidElementstateException 
		 * 			==> It Throws When user perform action on disabled element
		 */
		
		
		
		
		
		
		
	
			
			
		
		
		
		
		
		
		

	}

}
