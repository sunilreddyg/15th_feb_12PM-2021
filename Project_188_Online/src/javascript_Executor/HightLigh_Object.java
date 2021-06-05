package javascript_Executor;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HightLigh_Object {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		//Enable javascript executor at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		
		WebElement Header=driver.findElement(By.xpath("(//div[contains(.,'Create a new account')])[7]"));
		js.executeScript("arguments[0].style.backgroundColor ='red'", Header);
		Thread.sleep(2000);
		
		
		//Capture Scren
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("screens\\object_Hightlight.png"));
		
		
		

	}

}
