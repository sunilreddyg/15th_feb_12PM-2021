package ui_validation_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RuntimeElement_ISDisplayed
{

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://www.cleartrip.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		Thread.sleep(5000);
	
		
		/*
		 * step1:--> Click More options click
		 * Step2:--> verify Travel class Airlines option visible at webpage
		 */
		
		
		//target more options link
		WebElement More_options=driver.findElement(By.xpath("//a[@id='MoreOptionsLink']"));
		More_options.click();
		Thread.sleep(5000);
		
		WebElement Travel_Class=driver.findElement(By.xpath(".//*[@id='Class']"));
		WebElement Airlines=driver.findElement(By.xpath("//input[@name='airline']"));
		
		
		if(Travel_Class.isDisplayed() &&  Airlines.isDisplayed())
		{
			System.out.println("Testpass, Travelclass & airlines objects visible webpage ");
		}
		else
		{
			System.out.println("Testfail, Travelclass  & airlines objects not visible at webpage");
		}
		
		
		
		/*
		 * Scneario: Verify Travel class and airelines obejct hidden state.
		 * 
		 * 		Given site url http://cleartrip.com
		 * 		And verify Object object visible webpage
		 * 		When User click on moreoption
		 * 		Then Both objects shoudl hide from the webpage.
		 */
		
		if(Travel_Class.isDisplayed() && Airlines.isDisplayed())
		{
			 //Click Moreoptions link
			More_options.click();
			
			if(!Travel_Class.isDisplayed() &&  !Airlines.isDisplayed())  //!--NOT
			{
				System.out.println("Testpass, Object hidden at webpage");
			}
			else
			{
				System.out.println("Testfail, Bother object not hidden at webpage");
			}
		}
		
		
	}

}
