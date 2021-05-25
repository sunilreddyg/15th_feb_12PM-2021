package interactions.Keyborad_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown_And_KeyUp_Actions
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		
		//Identify frame and apply switch to it..
		WebElement ModalFrame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(ModalFrame);
		System.out.println("Frame identified");
		
		
		//press Control down using keyboard actions
		new Actions(driver).keyDown(Keys.CONTROL).pause(2000).perform();
		
		//Select Items
		driver.findElement(By.xpath("//li[contains(.,'Item 1')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 3')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 5')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 7')]")).click();
		
		//Release keydown action using keyboard actions
		new Actions(driver).keyUp(Keys.CONTROL).perform();
		
		
		
	}

}
