package chrome_options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Window_maximize_using_Chrome_options {

	public static void main(String[] args) 
	{
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://outlook.com");

	}

}
