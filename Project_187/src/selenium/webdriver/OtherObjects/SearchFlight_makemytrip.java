package selenium.webdriver.OtherObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFlight_makemytrip {

	public static void main(String[] args) throws Exception {
	
	
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//span[contains(.,'From')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[contains(.,'Bengaluru, India')]")).click();
		
		
		
		
		

	}

}
