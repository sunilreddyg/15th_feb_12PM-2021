package mq.java.corejava.variables.Webdriver_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Wrap_PageObject_To_Element_or_BY_Reference 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		//Script witout any references..
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Darshan");
		
		//Store Page Object Into Reference variable
		WebElement Login_password=driver.findElement(By.xpath("//input[contains(@data-testid,'royal_pass')]"));
		Login_password.clear();
		Login_password.sendKeys("Hello");
		System.out.println("password visible status is ==> "+Login_password.isDisplayed());
		System.out.println("password enabled statis is ==> "+Login_password.isEnabled());
		
		//Store HtmlObject Into Refernce Variable
		By Login_btn_location=By.xpath("//button[contains(@name,'login')]");
		WebElement Login_btn=driver.findElement(Login_btn_location);
		
		System.out.println("Login button visibel status is --> "+Login_btn.isDisplayed());
		ExpectedConditions.visibilityOfElementLocated(Login_btn_location).apply(driver);
		System.out.println("Object visible at webpage");
		driver.findElement(Login_btn_location).click();
		

	}

}
