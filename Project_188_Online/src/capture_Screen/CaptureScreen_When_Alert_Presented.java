package capture_Screen;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreen_When_Alert_Presented {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * In general selenium doesn't capture screen when alert was presented. reason is
		 * alert throw excpetion "unhandlealert".
		 */

		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		
		WebElement alert_trigger=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alert_trigger.click();
		Thread.sleep(4000);
		
		
		//Using robot interface capture alert 
		Robot robot=new Robot();
		
		//Get Screen Dimension
		Dimension Screen_Dimension=Toolkit.getDefaultToolkit().getScreenSize();
		BufferedImage image=robot.createScreenCapture(new Rectangle(Screen_Dimension));
		
		//This method will write image into local utilities
		File file=new File("C:\\Users\\SUNIL\\git\\15th_feb_12PM-2021\\Project_188_Online\\screens\\alert.png");
		ImageIO.write(image, "PNG", file);
		
		
		/*
		 * image extension
		 * 	PNG:--> portal network graphic
		 *  bmp:--> bitmap image
		 */
		
		
		
		
		
		
	}

}
