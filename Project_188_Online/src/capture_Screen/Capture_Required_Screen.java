package capture_Screen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Capture_Required_Screen {

	public static void main(String[] args) throws Exception 
	{
		

		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		
		WebElement Job_gallery=driver.findElement(By.xpath("//h2[contains(.,'Job Gallery')]"));
		new Actions(driver).moveToElement(Job_gallery).perform();
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
		
		//Create screenshot and convert into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.createDir(new File("screens"));
		FileHandler.copy(src, new File("screens\\image.png"));
		
		
		
		

	}

}
