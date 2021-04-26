package objectIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Text_And_Attribute_Identification {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Roles, Companies']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Roles, Companies']")).sendKeys("software testing");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Software Testing']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Automation Testing']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Selenium']")).click();
		
		
		
		
		
	}

}
