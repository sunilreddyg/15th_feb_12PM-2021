package capture_Screen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_Capture {

	public static void main(String[] args) throws IOException 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		
		
		//Create screenshot and convert into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.createDir(new File("screens"));
		FileHandler.copy(src, new File("screens\\image.png"));
		
		
		/*
		 * Disadvantage:-->
		 * 			=> In selenium 3 version screen only capture visible interface.
		 * 
		 * How to overcome this issue:-->
		 * 			=> In Selenium 4 same command capture entire page..
		 * 			=> Using mouse interaction or keyboard interaction navigate to required
		 * 				interface inorder to capture screen.
		 */
		
		
				

	}

}
