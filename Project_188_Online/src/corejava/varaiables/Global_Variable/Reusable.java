package corejava.varaiables.Global_Variable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reusable 
{
	
	WebDriver driver;
	String driver_path="drivers//chromedriver.exe";
	String url="http://facebook.com";
	
	By email_loc=By.xpath("//input[@id='email']");
	By password_loc=By.xpath("//input[@id='pass']");
	By Sign_in_btn_loc=By.xpath("//button[@data-testid='royal_login_button']");
	
	String usenrame_input;
	String password_input;
	
	public void Launch_browser()
	{
		System.setProperty("webdriver.chrome.driver", driver_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	public WebDriver get_chrome_browser_driver()
	{
		Launch_browser();
		driver.get(url);
		return driver;
	}
	
	
	
	public void load_webpage()
	{
		driver.get(url);
	}
	
	
	
	public void User_login()
	{
		WebElement Username=driver.findElement(email_loc);
		Username.clear();
		Username.sendKeys(usenrame_input);
		
		WebElement Password=driver.findElement(password_loc);
		Password.clear();
		Password.sendKeys(password_input);
		
		driver.findElement(Sign_in_btn_loc).click();
	}
	
	
	

}
