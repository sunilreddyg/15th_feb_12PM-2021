package ui_verifactioncommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_Commands {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		
		
		//Get page title from browser window
		String page_title=driver.getTitle();
		System.out.println(page_title);
		
		
		//get page url from browser window
		String page_url=driver.getCurrentUrl();
		System.out.println(page_url);
		
		
		//Get current window dynamic ID
		String WindowID=driver.getWindowHandle();
		System.out.println(WindowID);
		
		
		//Get current page source
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.close();
		

	}

}
