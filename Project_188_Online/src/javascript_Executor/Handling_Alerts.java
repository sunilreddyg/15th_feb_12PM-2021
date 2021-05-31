package javascript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		
		//Enable javascript executor at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Create alert 
		js.executeScript("alert('Browser launch successfull')");
		

	}

}
