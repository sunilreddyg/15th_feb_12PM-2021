package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Actions_WIth_JavaScript {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		//Enable javascript executor at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		
		WebElement Firstname=driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
		
		
		//Disable Firstname Editbox using javascript...
		js.executeScript("arguments[0].disabled=true", Firstname);
		Thread.sleep(5000);
		
		
		//Enable firstname editbox using javascript
		js.executeScript("arguments[0].disabled=false", Firstname);
		Thread.sleep(5000);
		
		//HIde object using javascript
		js.executeScript("arguments[0].style.visibility='hidden'", Firstname);
		Thread.sleep(5000);
		
		//Get Object visiblet at webapge using javascript
		js.executeScript("arguments[0].style.visibility='visible'", Firstname);
		Thread.sleep(5000);
		

	}

}
