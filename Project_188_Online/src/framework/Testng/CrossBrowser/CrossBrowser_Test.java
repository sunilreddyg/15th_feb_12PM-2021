package framework.Testng.CrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_Test 
{
	public WebDriver driver;
	
	@Test(priority=0)
	@Parameters("browsername")
	public void launchBrowser(String browser)
	{
		switch (browser) 
		{
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "browser_drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver", "browser_drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;

		default: System.out.println("browser mismatch");
			break;
		}
	}
	
	
	@Test(priority=1)
	@Parameters("appurl")
	public void loadApp(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	
	
	@Test(priority=2)
	public void User_Registration()
	{
		driver.findElement(By.name("firstname")).sendKeys("newuser");
	    driver.findElement(By.name("lastname")).sendKeys("webdriver");
	    driver.findElement(By.name("reg_email__")).sendKeys("newuserwebdriver@gmail.com");
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("newuserwebdriver@gmail.com");
	    driver.findElement(By.id("password_step_input")).sendKeys("hello1234");
	    {
	      WebElement dropdown = driver.findElement(By.id("day"));
	      dropdown.findElement(By.xpath("//option[. = '21']")).click();
	    }
	    {
	      WebElement dropdown = driver.findElement(By.id("month"));
	      dropdown.findElement(By.xpath("//option[. = 'Nov']")).click();
	    }
	    {
	      WebElement dropdown = driver.findElement(By.id("year"));
	      dropdown.findElement(By.xpath("//option[. = '2008']")).click();
	    }
	}
	
	
	

}
