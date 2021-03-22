package ui_verificationCommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Runtime_Attribute {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:-->  Verify Roundtrip Selection State
		 * 			Given site url is "http://makemytrip.com"
		 * 			And verify default selection for oneway
		 * 			When user click on Return date\
		 * 			Then selection changes to Roundtrip radio button
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement Oneway_Sbtn=driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
		String Oneway_Runtime_class=Oneway_Sbtn.getAttribute("class");
		System.out.println("Class property available at runtime--> "+Oneway_Runtime_class);
		
		
		if(Oneway_Runtime_class.equals("selected"))
		{
			
			WebElement ReturnDate=driver.findElement(By.xpath("//label[contains(.,'RETURNTap to add a return date for bigger discounts')]"));
			ReturnDate.click();
			Thread.sleep(2000);
			
			WebElement Roundtrip_Sbtn=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
			String roundtrip_runtime_class=Roundtrip_Sbtn.getAttribute("class");

			if(roundtrip_runtime_class.equals("selected"))
			{
				System.out.println("Testpass, Roundtrip selected when click on Return Date");
			}
			else
				System.out.println("Testfail, Roundtrip is not selected when click on Return Date");
				
		}
		else
			System.out.println("PreCondition failed, Oneway is not Selected on Browser launched");
		


	}

}
