package ui_verifactioncommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_object_Visible_status {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:--> Verify object returen date visible status
		 * 	
		 * 			Given site url is "https://www.facebook.com/r.php"
		 * 			When user enter valid email
		 * 			Then verify retype password visible at webpag
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		
		
		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("info@gmail.com");
		Thread.sleep(4000);
		
		WebElement retype_divison=driver.findElement(By.xpath("//div[@id='reg_form_box']/div[3]"));
		
		//Get runtime attribute value
		String Runtime_class=retype_divison.getAttribute("class");
		
		if(!Runtime_class.equals("hidden_elem"))  //!--not
		{
			System.out.println("Testpass,Objet visible at webapge");
		}
		else
		{
			System.out.println("Testfail, Object hidden at webpage");
		}
		
		
		
		/*
		 * Direct method to verify object visible at webpage
		 */
		WebElement retype_email=driver.findElement(By.name("reg_email_confirmation__"));
		if(retype_email.isDisplayed())
		{
			System.out.println("OBjevt visible at webpage");
		}
		else
		{
			System.out.println("object hidden at webpage");
		}
		

	}

}
