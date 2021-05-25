package interactions.Keyborad_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_Example 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		
		//Create object for Actions class
		Actions action=new Actions(driver);
		
		WebElement Location_textbox=driver.findElement(By.xpath("//input[@id='Sug_locsugg']"));
		action.sendKeys(Location_textbox, "HYD")
		.pause(2000)
		.sendKeys(Keys.ARROW_DOWN)
		.pause(2000)
		.sendKeys(Keys.ENTER)
		.perform();
		
		
		
		
		WebElement Industry_textbox=driver.findElement(By.xpath("//input[@id='cjaInd']"));
		action.sendKeys(Industry_textbox, "bpo")
		.pause(2000)
		.sendKeys(Keys.ENTER)
		.perform();
		
		
		/*
		 * Note:-->
		 * 		for keyword shortcuts webdriVer doesn't throw any excpetion on failure.
		 * 		use keyboard shortcuts as secondory alternative.
		 */
		
		
		

	}

}
