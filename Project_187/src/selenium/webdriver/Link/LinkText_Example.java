package selenium.webdriver.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Example {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Pages")).click();
		driver.findElement(By.linkText("Cristiano Ronaldo")).click();
		Thread.sleep(5000); //Timeout to Scroll down page manually
		
		driver.findElement(By.linkText("Athlete")).click();
		driver.findElement(By.partialLinkText("See more")).click();
		driver.findElement(By.linkText("Motivational speaker")).click();
	}

}
