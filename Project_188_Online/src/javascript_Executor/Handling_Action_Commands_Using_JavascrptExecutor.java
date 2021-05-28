package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Action_Commands_Using_JavascrptExecutor {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		//Enabled javascript executor on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Type text into editbox using javascript
		js.executeScript("document.getElementById('email').value='darshan@gmail.com'");
		js.executeScript("document.getElementById('pass').value='Hello1234'");
	
		
		/*
		 * How to execute javascript executor when object doesn't contain
		 * id property
		 */
		WebElement Login_button=driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click();", Login_button);

	}

}
