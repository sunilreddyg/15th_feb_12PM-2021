package object_identification;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Object_With_Name_Property
{
	
	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("newuser");

		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("webdriver");
		
		//Object identification using full xpath
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")).sendKeys("mewuserwebdriver@gmail.com");
		
		//Object identification using name property
		driver.findElement(By.name("reg_email_confirmation__")).clear();
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("newuserwebdriver@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).clear();
		driver.findElement(By.name("reg_passwd__")).sendKeys("hello12345");
		
		
		
	}

}
