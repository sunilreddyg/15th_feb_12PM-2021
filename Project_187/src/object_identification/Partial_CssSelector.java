package object_identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_CssSelector {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("input[id*='u_0_n']")).clear();
		driver.findElement(By.cssSelector("input[id*='u_0_n']")).sendKeys("Newuser");
		
		driver.findElement(By.cssSelector("input[id*='u_0_p']")).clear();
		driver.findElement(By.cssSelector("input[id*='u_0_p']")).sendKeys("webdriver");
		
		
		
		

	}

}
