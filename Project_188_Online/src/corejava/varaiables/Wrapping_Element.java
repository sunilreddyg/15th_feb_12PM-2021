package corejava.varaiables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wrapping_Element 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Syntax without any reference
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("Darshan");
		
		
		//Wrapper class webElement with page reference
		WebElement Password_text=driver.findElement(By.id("pass"));
		Password_text.clear();
		Password_text.sendKeys("Hello@123");
		
		
		//By Wrapper class [By class as option to declare as global variable so that it can access anywhere with in project]
		By Sign_btn_loc=By.xpath("//button[@data-testid='royal_login_button']");
		WebElement Sign_button=driver.findElement(Sign_btn_loc);
		Sign_button.click();
		
		
		
		

	}

}
