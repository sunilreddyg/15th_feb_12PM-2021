package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Element_To_Target {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://marcojakob.github.io/dart-dnd/basic/");
		driver.manage().window().maximize();
		
		
		WebElement Doc1=driver.findElement(By.xpath("(//img[@class='document'])[1]"));
		WebElement Doc2=driver.findElement(By.xpath("(//img[@class='document'])[2]"));
		WebElement Doc3=driver.findElement(By.xpath("(//img[@class='document'])[3]"));
		WebElement Doc4=driver.findElement(By.xpath("(//img[@class='document'])[4]"));
		
		
		WebElement Trash_bin=driver.findElement(By.xpath("//div[@class='trash']"));
		
		
		
		//Create object for Actions class
		Actions action=new Actions(driver);
		
		//Perform drag object to target usign direct method
		action.dragAndDrop(Doc1, Trash_bin).perform();
		action.dragAndDrop(Doc2, Trash_bin).perform();
		
		
		//Perform drag and drop using indirect method
		action.clickAndHold(Doc3).moveToElement(Trash_bin).release().perform();
		action.clickAndHold(Doc4).moveToElement(Trash_bin).release().perform();
		
		
		
		
	}

}
