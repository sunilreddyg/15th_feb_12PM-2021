package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavsScript_Executor_Scroll_To_View {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		//Enable javascript executor at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Object at webpage
		WebElement Help_link=driver.findElement(By.linkText("Help"));
		
		js.executeScript("arguments[0].scrollIntoView()", Help_link);
		//Same action we can do with moveElement using action classes
		Thread.sleep(3000);
		

		js.executeScript("arguments[0].scrollTop", Help_link);
	}

}
