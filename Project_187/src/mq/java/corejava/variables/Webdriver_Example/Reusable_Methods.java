package mq.java.corejava.variables.Webdriver_Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reusable_Methods
{
	String Browser_name;
	String Driver_path;
	WebDriver driver;
	String url;
	String username;
	String password;
	
	public void Launch_Browser()
	{
		if(Browser_name.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",Driver_path+"chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(Browser_name.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",Driver_path+"geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
			System.out.println("Browsername mismatch Failed to initiate browser");
		
	}
	
	
	
	public void Get_App()
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	
	public void User_login()
	{
		WebElement UID=driver.findElement(Reusable_Objects.Login_Email);
		UID.clear();
		UID.sendKeys(username);
		
		WebElement PWD=driver.findElement(Reusable_Objects.Login_password);
		PWD.clear();
		PWD.sendKeys(password);
		
		driver.findElement(Reusable_Objects.Login_submit_btn).click();
	}
	
	
	
	
	

}
