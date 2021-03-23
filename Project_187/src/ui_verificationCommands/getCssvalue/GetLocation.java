package ui_verificationCommands.getCssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement Roundtrip_Label=driver.findElement(By.xpath("//label[.='Round Trip']"));
      
		//Get object x and y coordinates
		int ObjX=Roundtrip_Label.getLocation().getX();
		int ObjY=Roundtrip_Label.getLocation().getY();
		System.out.println("Object x Coordianates are ---> "+ObjX);
		System.out.println("Object y coordinates are ---. "+ObjY);
		
		
		//Verify Object visibility using x and y coordinates
		if(ObjX > 0)
			System.out.println("Object is visible");
		else
			System.out.println("Object is hidden");
		
		
		
		
		/*
		 * Note:--. For hidden object get location return zero coordinates
		 */
		
		
	}

}
