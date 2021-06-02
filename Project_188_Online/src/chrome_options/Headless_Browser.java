package chrome_options;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Browser
{

	public static void main(String[] args) 
	{
		
		
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		
		//Second method to set headless argument
		//options.addArguments("--headless");
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		System.out.println("Browser opened");
		
		
		driver.get("http://outlook.com");
		System.out.println("url loaded");
		
		
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		System.out.println("Signin button clicked");
		
		
		WebElement Email=driver.findElement(By.xpath("//input[contains(@id,'i0116')]"));
		Email.clear();
		Email.sendKeys("sunilredy.gajjala@outlook.com");
		System.out.println("Input typed into email text box");
		
		
		/*
		 * Note:--> End of the selenium script need to run using CI tool [Continiution integration tools]
		 * 			like jenkins. These CI tools run selenium in background there this headless browser
		 * 			options is very usefull.
		 */

	}

}
