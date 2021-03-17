package mq.java.corejava.variables.Webdriver_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reusable_Objects 
{
	//POM--> pageobject model
	public static By Login_Email=By.xpath("//input[contains(@id,'email')]");
	public static By Login_password=By.xpath("//input[contains(@data-testid,'royal_pass')]");
	public static By Login_submit_btn=By.xpath("//button[contains(@data-testid,'button')]");

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(Login_Email).sendKeys("Darshan");
		driver.findElement(Login_password).sendKeys("djfkld");
		driver.findElement(Login_submit_btn).click();
			
	}
	
	
}
