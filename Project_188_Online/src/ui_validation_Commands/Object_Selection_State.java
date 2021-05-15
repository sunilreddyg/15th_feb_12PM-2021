package ui_validation_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Object_Selection_State 
{

	public static void main(String[] args) throws Exception
	{
		/*
		 * Note:-->
		 * 			This action only works for radio button and checkboxes
		 * 			which objects have type="radio"  type="checkbox"
		 */
		
		
		/*
		 * Scenario: Verify keep me signin checkon unchecked before password entry
		 * 			Given site url is http://outlook.com
		 * 			And click on Singin button
		 * 			when enter valid email and click next button
		 * 			Then Verify Keep me sign in checkbox should be unchecked..
		 */

		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https://www.outlook.com");  
		driver.manage().window().maximize();  
		
		
		//Identify Signin button [even hidden /visible object identification is same]
		WebElement Signin_btn=driver.findElement(By.xpath("//a[text()='Sign in']"));
		Signin_btn.click();
		
		//COndition to verify Email object is visble and enable before perform action
		WebElement Email_EB=driver.findElement(By.id("i0116"));
		Email_EB.clear();
		Email_EB.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		Thread.sleep(5000);
		
		//Identify Keepme signin checkbox
		WebElement KeepMe_signin_checkbox=driver.findElement(By.xpath("//input[contains(@id,'KMSI0Pwd')]"));
		
		//Verify Checkbox selection status
		if(!KeepMe_signin_checkbox.isSelected())
		{
			System.out.println("By dafault it is not selected");
		}
		else
		{
			System.out.println("it is Selected");
		}
	}

}
