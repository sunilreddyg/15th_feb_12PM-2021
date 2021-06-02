package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waif_For_Numberof_windows {

	public static void main(String[] args) {
		
		

		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();					
		driver.get("https://facebook.com");
		driver.manage().window().maximize(); 
	
		
		//Click Instagram hyper link [This link open page in new window]
		//driver.findElement(By.linkText("Instagram")).click();
		
		//Wait until New window opened
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println("Timeout released total two windows are opened");

	}

}
