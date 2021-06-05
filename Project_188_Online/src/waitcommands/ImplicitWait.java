package waitcommands;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		/*
		 * Whenever nosuchelement found this command enables back up time for given seconds.
		 * Implicitwait manage timegap until object found at document object model...
		 */
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email"));
		System.out.println("object found");

	}

}
