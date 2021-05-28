package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Dropdowns_with_Javascript_Executor {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		//Enable javascript executor at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		
		WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		js.executeScript("arguments[0].value='Newuser'", Firstname);
		
		
		WebElement Lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		js.executeScript("arguments[0].value='WebDriver'", Lastname);
		
		
		//Seleting dropdown options
		js.executeScript("document.getElementById('day').value='6'");
		js.executeScript("document.getElementById('month').value='9'");
		js.executeScript("document.getElementById('year').selectedIndex='4'");
		
		
		
		//Selecting radio button using javasript command
		WebElement Female_radio_btn=driver.findElement(By.xpath("//input[@value='1']"));
		js.executeScript("arguments[0].click();", Female_radio_btn);
		Thread.sleep(1000);
		
		
		//Select radio button using javascript command
		WebElement male_radio_btn=driver.findElement(By.xpath("//input[@value='2']"));
		js.executeScript("arguments[0].checked=true", male_radio_btn);
		Thread.sleep(1000);
		
		
		

	}

}
