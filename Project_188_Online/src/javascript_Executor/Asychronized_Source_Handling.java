package javascript_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asychronized_Source_Handling {

	public static void main(String[] args) 
	{
		
		

		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		
		long start = System.currentTimeMillis();
		
		   ((JavascriptExecutor) driver).executeAsyncScript(
		       "window.setTimeout(arguments[arguments.length - 1], 500);");
		  
		System.out.println("Elapsed time "+(System.currentTimeMillis()-start));
		
		
		
		//Other way to manage asynhcronized timeout
		driver.manage().timeouts().setScriptTimeout(100, TimeUnit.SECONDS);
		
		
		
		//gmail window to load
		 WebElement composeButton = driver.findElement(By.id("compose-button"));
		 composeButton.click();   //It open ajax window
		 

		   ((JavascriptExecutor) driver).executeAsyncScript(
		       "var callback = arguments[arguments.length - 1];" +
		       "mailClient.getComposeWindowWidget().onload(callback);");
		   
		   driver.switchTo().frame("composeWidget");
		   driver.findElement(By.id("to")).sendKeys("bog@example.com");

	}

}
