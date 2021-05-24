package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_RightClick_Action 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		
		WebElement Button=driver.findElement(By.xpath("//span[.='right click me']"));
		//Perform right click on button
		new Actions(driver).contextClick(Button).perform();
		Thread.sleep(3000);
		
		WebElement Delete_btn=driver.findElement(By.xpath("//li/span[.='Delete']"));
		new Actions(driver).click(Delete_btn).perform();
		Thread.sleep(3000);
		
		//Closing alert window
		driver.switchTo().alert().accept();

	}

}
