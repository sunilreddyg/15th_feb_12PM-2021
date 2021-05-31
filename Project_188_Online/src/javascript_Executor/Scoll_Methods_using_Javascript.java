package javascript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scoll_Methods_using_Javascript {

	public static void main(String[] args) throws Exception
	{
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		
		//Enable javascript executor at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Scroll Down winodw using coordinates
		js.executeScript("window.scroll(0,300)");
		//Same action we can also perform with robot interface using mousewheel command.
		Thread.sleep(3000);
		
		
		
		//Scroll up window using coordinates
		js.executeScript("window.scroll(300,0)");
	}

}
