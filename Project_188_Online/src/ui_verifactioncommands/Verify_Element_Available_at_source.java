package ui_verifactioncommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Available_at_source {

	public static void main(String[] args) 
	{
		
		/*
		 * This syntax prevent action when elemnet not presened at source...
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		
		String Page_title="Facebook – log in or sign up";
		String Page_url="https://www.facebook.com/";
		String Page_Element="email";
		
		
		//Get PageSource [This element is userfull to verify dynamic elements availabel at page source]
		String PageSource=driver.getPageSource();
		if(PageSource.contains(Page_Element))
		{
			WebElement Email=driver.findElement(By.id("email"));
			Email.clear();
			Email.sendKeys("qadarshan@gmail.com");
		}
		else
		{
			System.out.println("Element not presented at source");
		}
		
		
		
		/*
		 * What is dynamic element at source:-->
		 * 			The elemnets laod into source according to 
		 * 			cetain acction at webpage..
		 */
		
		
		

	}

}
