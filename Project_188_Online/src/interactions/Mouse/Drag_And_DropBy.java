package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_DropBy 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");
		driver.manage().window().maximize();
		
		
		WebElement Scroller1=driver.findElement(By.xpath("//div[@class='rangeslider__handle']"));
		WebElement Scroller2=driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[2]"));
		WebElement Scroller3=driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[3]"));
		
		

		//Create object for actions class
		Actions action=new Actions(driver);
		
		//Dragobject to location using x and y coordinates
		action.dragAndDropBy(Scroller1, 50, 0).perform();
		Thread.sleep(2000);
		
		//Dragobject to location using x and y coordinates
		action.dragAndDropBy(Scroller2, -50, 0).perform();
		Thread.sleep(2000);
		
		//Dragobject to location using x and y coordinates
		action.dragAndDropBy(Scroller3, -50, 0).perform();
		Thread.sleep(2000);
		
		
	}

}
