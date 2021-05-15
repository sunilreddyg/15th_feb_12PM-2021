package ui_validation_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_DIsabled_OR_Enabled_Elements {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenairo: Verify registration button disabled status
		 * 		Given site url http://practice.automationtesting.in/my-account/
		 * 		When user enter password less than required characters
		 * 		Then verify password button should be disable
		 * 		And not allowed perform user action.
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("http://practice.automationtesting.in/my-account/");  
		driver.manage().window().maximize();   
		
		
		WebElement Password_Editbox=driver.findElement(By.xpath("//input[@id='reg_password']"));
		Password_Editbox.sendKeys("aa");    //Invalid password input
		Thread.sleep(4000);
		
		WebElement register_btn=driver.findElement(By.name("register"));
		
		if(!register_btn.isEnabled())
		{
			System.out.println("Testpass, Object is disabled");
		}
		else
		{
			System.out.println("Testfail, Object is enabled");
		}
								
		
		
		/*
		 * Scenairo: Verify registration button disabled status
		 * 		Given site url http://practice.automationtesting.in/my-account/
		 * 		When user enter password with required characters
		 * 		Then verify password button should be enabled
		 * 		And allow user perform action...
		 * 
		 */
		

	}

}
