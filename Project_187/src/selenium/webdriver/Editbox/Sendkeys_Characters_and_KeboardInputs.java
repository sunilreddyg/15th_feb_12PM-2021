package selenium.webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Characters_and_KeboardInputs {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
		//OBject identification with xpath
		driver.findElement(By.xpath("/html/body/header/div/aside/div/nav/ul/li[2]/a")).click();
		
		//Type text into editbox and press enter key
		driver.findElement(By.id("i0116")).clear();
		driver.findElement(By.id("i0116"))
		.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		Thread.sleep(5000);
		
		//Type text into editbox and press Enter key
		driver.findElement(By.id("i0118")).clear();
		driver.findElement(By.id("i0118")).sendKeys("Hello12345"+Keys.ENTER);
		
		
		
		
		

	}

}
