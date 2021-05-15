package ui_verifactioncommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Rect_Commands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		WebElement login_bot=driver.findElement(By.id("ctl00_HyperLinkLogin"));
		
		int obj_height=login_bot.getRect().getHeight();
		int obj_width=login_bot.getRect().getWidth();
		int obj_x=login_bot.getRect().getX();
		int obj_y=login_bot.getRect().getY();
		
		System.out.println("Object height is => "+obj_height+" Object widht is => "+obj_width);
		System.out.println("Object x coords is => "+obj_x+" Object y coords is => "+obj_y);
	}

}
