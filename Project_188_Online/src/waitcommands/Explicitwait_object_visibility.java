package waitcommands;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_object_visibility 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		//Enable explicit wait on automation browser
		WebDriverWait wait=new WebDriverWait(driver, 50);
		
		//wait for Element to visible.. [Recomended for pageobject syntax]
		WebElement Download_button=driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[1]"));
		wait.until(ExpectedConditions.visibilityOf(Download_button));
		System.out.println("Download object visible at webpage");
		
	
		//Wait for Elemen to visible.. [Recomended for Regular syntax]
		By Projects_link=By.xpath("(//a[contains(.,'Projects')])[1]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Projects_link));
		System.out.println("project links  visiblet at webpage");
		
		
		/*
		 * Note:--> If time is exceded it throws "TimeoutException"
		 */
		
			

	}

}
