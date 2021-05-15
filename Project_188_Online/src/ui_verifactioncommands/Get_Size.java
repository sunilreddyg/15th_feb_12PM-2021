package ui_verifactioncommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Size {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(40000);
		
		WebElement login_bot=driver.findElement(By.id("ctl00_HyperLinkLogin"));
		
		
		//Get Select object height and width at webpage
		int obj_height=login_bot.getSize().getHeight();
		int obj_width=login_bot.getSize().getWidth();
		
		System.out.println(obj_height+"    "+obj_width);
		
		
		

	}

}
