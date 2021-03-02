package selenium.webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Example {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname"))
		.sendKeys("ajay"+Keys.TAB+"krishna"+Keys.TAB+"ajaykrishna@gmail.com");
		
		
		//select dropdown option using sendkeys
		driver.findElement(By.name("birthday_day")).sendKeys("25");
		//selecting month dropdown using keyboard characters
		driver.findElement(By.name("birthday_month")).sendKeys("S");
		driver.findElement(By.name("birthday_month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		//Selecting radio button using keyboard shortcut
		driver.findElement(By.xpath("//input[@value='1']"))
		.sendKeys(Keys.SPACE);
}

}