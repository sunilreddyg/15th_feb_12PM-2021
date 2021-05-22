package switchcommands.windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_to_next_window 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		/*
		 * 1. Launch chromebrowser and visit site "http://facebook.com"
		 * 2. Click Instagram hyper link[It opens in new window] 
		 * 3. In Instagram window enter login details
		 * 
		 * Note:--> This program is usefull when two windows are opened
		 */
		
		
		//Step1
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
	    driver.manage().window().maximize();
	    
	    
	    
	    //Get Current window dynamic id  [which window is focused that window id it present]
	    //[Note:--> It is differnet from one brower to anotehr browser]
	    String WIN1_ID=driver.getWindowHandle();
	    System.out.println(WIN1_ID);
	    
	    
	    //Step2
	    WebElement Instagram_Hyper_link=driver.findElement(By.linkText("Instagram"));
	    Instagram_Hyper_link.click();
	    Thread.sleep(5000); //Static timeout to load sub window instagram
	    
	    /*
	     * Method retrieve all window dynamic id's which
	     * was open through webdriver session..
	     */
	    Set<String> All_WIN_IDS=driver.getWindowHandles();
	    
	    //Applying foreach loop to read collection of id's 
	    //How to apply forach  [type foreach use contrl+Space  --> Press Enter]
	    for (String SIngleID : All_WIN_IDS) 
	    {
			driver.switchTo().window(SIngleID);
		}
	    
	    
	    System.out.println("current window title ---> "+driver.getTitle());
 
	    
	    //Insagram page login
	    WebElement Mobile_Entry=driver.findElement(By.xpath("//input[@name='username']"));
	    Mobile_Entry.sendKeys("9030248855");
	    
	    
	    
	    //After job completed at instagram window switch controls back to facebook page
	    driver.switchTo().window(WIN1_ID);
	    System.out.println("Current window title is ---> "+driver.getTitle());
	    
	    
	    //Enter Email details at facebook window
	    WebElement Facebook_email=driver.findElement(By.xpath("//input[@id='email']"));
	    Facebook_email.sendKeys("9030248855");
	    

	}

}
