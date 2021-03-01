package object_identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identify_OBject_With_ID_property {

	public static void main(String[] args) {
	
		//Setting Runtime environment variable for chrome driver
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //launch Browser
		driver.get("http://facebook.com");		//Load webpage
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("9030248855");
		driver.findElement(By.id("pass")).sendKeys("Hello12345");
		
	}

}
