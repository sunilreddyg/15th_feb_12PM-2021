package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_At_pageSource {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//Get page Source
		String PageSource=driver.getPageSource();
		
		//Verify expected elementid presented at pagesource
		if(PageSource.contains("email1"))
		{
			//FindElement throw NosuchElement exception incase element not available at source
			WebElement Email=driver.findElement(By.id("email"));
			Email.clear();
			Email.sendKeys("darshan");

		}
		else
			System.out.println("Element not presented at source");
		
		
		
		
		//We can use try catch block as alternative for pagesource
		
		try {
			
			//FindElement throw NosuchElement exception incase element not available at source
			WebElement password=driver.findElement(By.id("pass1"));
			password.clear();
			password.sendKeys("Hello");
			
		} catch (Exception e) {
			System.out.println("Element Not Found source");
		}
		
		
		
		
		
		
		//Finally keyword in Try catch handling

		try {
			driver.findElement(By.name("login")).click();

		} 
		catch(Exception e)
		{
			System.out.println("login element not found");
		}
		finally 
		{
			driver.close();  //Clean browser either element displayed or catch exception
			System.out.println("browser closed");
		}
		
		
		
		
		

	}

}
