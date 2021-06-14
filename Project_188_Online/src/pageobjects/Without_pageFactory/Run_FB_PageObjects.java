package pageobjects.Without_pageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_FB_PageObjects 
{

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(FB_HOME.url);
		driver.manage().window().maximize();
		
		
		boolean flag=driver.findElement(FB_HOME.Signin_Email).isDisplayed();
		System.out.println("Object is Displayed? "+flag);
		
		driver.findElement(FB_HOME.Signin_Email).clear();
		System.out.println("Clear text at editbox successfull");
		
		driver.findElement(FB_HOME.Signin_Email).sendKeys("Darshan@gmail.com");
		System.out.println("Input Typed into textbox successfull");
		
		String typed_input_is=driver.findElement(FB_HOME.Signin_Email).getAttribute("value");
		System.out.println("Characters dispalyed at editbox "+typed_input_is);
		
		
		
		
		
		

	}

}
