package selenium.webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete_Editbox {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://cleartrip.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		

	}

}
