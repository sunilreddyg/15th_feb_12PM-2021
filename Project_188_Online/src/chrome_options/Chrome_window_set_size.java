package chrome_options;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_window_set_size {

	public static void main(String[] args) throws Exception 
	{
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("window-size=600,400");
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://outlook.com");
		
		
		
		
		Thread.sleep(5000);
		driver.manage().window().setSize(new Dimension(1020, 200));
		

	}

}
