package switchcommands.windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window_Using_Iterator 
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
	    
	    
	    //Step2
	    WebElement Instagram_Hyper_link=driver.findElement(By.linkText("Instagram"));
	    Instagram_Hyper_link.click();
	    Thread.sleep(5000); //Static timeout to load sub window instagram
	    
	    
	    
	    //Get All dynamic window id's
	    Set<String> all_window_ids=driver.getWindowHandles();
	    
	    //Convert all set string values into iterator.
	    Iterator<String> itr=all_window_ids.iterator();
	    
	    //Target Each token of iterator value using "Next" Keyword
	    String WindowID1=itr.next();
	    String WindowID2=itr.next();
	    
	    System.out.println(WindowID1+"   "+WindowID2);
	    
	    
	    driver.switchTo().window(WindowID2);
	    System.out.println("Current window title is ---> "+driver.getTitle());
	    
	    //Switch back to window1
	    driver.switchTo().window(WindowID1);
	    System.out.println("Current window title is ---> "+driver.getTitle());
	    
	    /*
	     * FAQ:--> Switch to sub window without using loop.
	     * 
	     * 			Try above sytax..
	     */
	    

	}

}
