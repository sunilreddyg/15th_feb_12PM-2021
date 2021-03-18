package ui_verificationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_Commands {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.dev");
		driver.manage().window().maximize();
		
		
		String Runtime_title=driver.getTitle();
		System.out.println("Current window title is ---> "+Runtime_title);
		
		String Runtime_url=driver.getCurrentUrl();
		System.out.println("Currnt window url is ---> "+Runtime_url);
		
		String WindowID=driver.getWindowHandle();
		System.out.println("Runtime window id available ---> "+WindowID);
		
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		
		driver.close();
		

	}

}
