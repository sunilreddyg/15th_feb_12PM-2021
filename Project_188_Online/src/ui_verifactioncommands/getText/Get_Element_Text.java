package ui_verifactioncommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Get_Element_Text 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario: Verifying login with invalid email address
		 * 
		 * 		Given site url is http://outlook.com
		 * 		And click Signin button
		 * 		When Use enter invalid email address
		 * 		And click on Next button to validate email
		 * 		Then error message should be displayed
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.outlook.com");
		driver.manage().window().maximize();
		
		WebElement Singn_nav_button=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Singn_nav_button.click();
		
		WebElement email_textbox=driver.findElement(By.xpath("//input[@id='i0116']"));
		email_textbox.clear();
		email_textbox.sendKeys("qadarshan@gmail.com");
		
		WebElement Email_Next_validation_btn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		Email_Next_validation_btn.click();
		
		
		//Wait for Error message to load
		Thread.sleep(5000);
		
		
		//Target Error location
		WebElement Error_location=driver.findElement(By.xpath("//div[@id='usernameError']"));
		//Catpure text at location
		String Act_text=Error_location.getText();
		
		//Stored expected text
		String Exp_text="That Microsoft account doesn't exist. Enter a different account or get a new one.";

		
		//Verify Expected and actual text
		if(Act_text.equals(Exp_text))
		{
			System.out.println("Expected text displayed");
		}
		else
		{
			System.out.println("failed to displaye error message.");
		}
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
