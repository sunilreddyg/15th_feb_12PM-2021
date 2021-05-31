package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Load_Timeout {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		
		/*
		 * This command manage until all pageobjects load at webpage. By Default
		 * Webdriver manage timeload during new pages opened..
		 */
		
		
		driver.get("http://cleartrip.com");
		System.out.println("Page load successfull");

	}

}
