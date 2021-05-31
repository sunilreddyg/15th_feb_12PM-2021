package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetScript_Timeout {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().setScriptTimeout(100, TimeUnit.SECONDS);
		
		/*
		 * This command manage asychronized source to load at webpage.
		 * 		[Mostly when ajax windows loading]
		 */
		driver.get("http://makemytrip.com");
		System.out.println("Source synchonized");
		
	}

}
