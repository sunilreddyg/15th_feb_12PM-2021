package mq.java.corejava.variables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Global_Initiation_with_Webdriver_Example 
{

	public static void main(String[] args) throws Exception 
	{
		
		String browser="chrome";
		
		WebDriver driver=null;
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
	
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.close();
	}

}
