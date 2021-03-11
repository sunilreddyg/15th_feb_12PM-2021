package object_identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Attribute_And_Text_Identification {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@name='keyskills']")).clear();
		driver.findElement(By.xpath("//input[@name='keyskills']")).sendKeys("software testing");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Software Testing']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Manual Testing']")).click();
		Thread.sleep(2000);
		
		
	}

}
