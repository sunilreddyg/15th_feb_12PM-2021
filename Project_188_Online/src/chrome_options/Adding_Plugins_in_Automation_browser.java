package chrome_options;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Adding_Plugins_in_Automation_browser {

	public static void main(String[] args) 
	{
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		options.addExtensions(new File("C:\\Users\\SUNIL\\Downloads\\SeleniumIDE.crx"));
		options.addExtensions(new File("C:\\Users\\SUNIL\\Downloads\\Truepath.crx"));
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://google.com");
		
		
		/*
		 * Downlaod CRX file
		 * 		https://www.crx4chrome.com/
		 * 		download any browser extension file 
		 * 		Add to chrome options before launching your browser
		 */

	}

}
