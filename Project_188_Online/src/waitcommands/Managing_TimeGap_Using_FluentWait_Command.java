package waitcommands;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Managing_TimeGap_Using_FluentWait_Command {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		/*
		 * What is fluent wait?
		 * 		Fluent wait is used to manage frequent time gaps
		 * 
		 * What is the difference between explicit and fluentwait?
		 * 		In fluent wait  we can manage dynamic time gap to load object
		 * 		at webpage and also it allow to define polling seconds and Exception
		 * 		along with time gap.
		 * 
		 */
		
		
			// Waiting 30 seconds for an element to be present on the page, checking
		    // for its presence once every 5 seconds.
		    // Condition alsoignore exception
		  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(10))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class,ElementNotVisibleException.class);
		  
		  
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		  System.out.println("Elemnet visible at webpage");
		  
		  
		  
		  
		  
		  
		  

	}

}
