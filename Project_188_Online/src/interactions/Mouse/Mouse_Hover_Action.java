package interactions.Mouse;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Action 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * 1. Open Naukri website
		 * 2. Place mouse point at Jobs menu
		 * 3. Select one of option from mene list [Exp_ it opens in new tab]
		 * 4. Switch to New WIndow
		 */
		
		//Step1
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
	    driver.manage().window().maximize();
	    
	    
	    //Create object for actions class
	    Actions action=new Actions(driver);    //We should pass driver refernce inorder to perform new actions at webdriver browser.
	    
	    //Step2
	    WebElement Jobs=driver.findElement(By.xpath("//div[@class='mTxt'][contains(.,'Jobs')]"));
	    action.moveToElement(Jobs).perform();
	    //It is mandatory we should end with perform method when user implement actions class methods
	    
	    /*
	     * perform:-->
	     * 		=> Perform method complete action, without perform method
	     * 			the action is incomplete so that we don't get error 
	     * 			but action still incomplete..
	     */
	 
	    //Step3
	    WebElement Register=driver.findElement(By.xpath("//a[@data-ga-track='Main Navigation Jobs|Register Now']"));
	    action.pause(2000).click(Register).perform();
	    
	    
	    Thread.sleep(4000);
	    
	    //This syntax will help to switch to required window with help of title
	    
	    Set<String> ALLWINIDS=driver.getWindowHandles();
	    System.out.println("Number of windows displayed is ----> "+ALLWINIDS.size());
	    for (String SIngleID : ALLWINIDS) 
	    {
			driver.switchTo().window(SIngleID);
			
			if(driver.getTitle().contains("Register on Naukri.com"))
			{
				break;
			}
		}
	    
	   
	  
	    WebElement Login_at_Register_page=driver.findElement(By.xpath("//a[@href='https://login.naukri.com/nLogin/Login.php']"));
	    Login_at_Register_page.click();
	    
	    
	    
	    
	    
		

	}

}
