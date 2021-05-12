package ui_verifactioncommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Runtime_Attribute1 {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:--> Verify Roundtrip radio button selection
		 * 		Given site url is "http://makemytrip.com"
		 * 		And verify triptype selecton oneway on browser launch
		 * 		When user tap on return date for bigger discounts
		 * 		Then Selection comes to roundtrip from oneway
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		
		
		
		//Identify onway dropdown
		WebElement Oneway_button=driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
		WebElement ReturnDate=driver.findElement(By.xpath("//span[contains(.,'RETURN')]"));
		WebElement Roundtrip_button=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		
		//Get runtime attribute value
		String Oneway_Selection=Oneway_button.getAttribute("class");
		
		//Decision statement to accept on onway selected
		if(Oneway_Selection.equals("selected"))
		{
			System.out.println("Oneway button selected on browser launch");
			
			//Tap on return dat
			ReturnDate.click();
			Thread.sleep(2000);
			
			//Get runtime attribute value
			String Roundtrip_Selection=Roundtrip_button.getAttribute("class");
			if(Roundtrip_Selection.equals("selected"))
			{
				System.out.println("Testpass, Roundtrip is selectd on return date selection");
			}
			else
			{
				System.out.println("Testfail, Roundtrip is not selected on retund date selection");
			}
			
			
		}
		else
		{
			System.out.println("Precondition failed oneway in not selected on browserlaunch");
		}
		

	}

}
