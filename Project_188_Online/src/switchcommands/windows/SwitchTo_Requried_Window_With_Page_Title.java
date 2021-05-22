package switchcommands.windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Requried_Window_With_Page_Title {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //Open browser window
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//Capture current Window dynamic id
		String WIN1_ID=driver.getWindowHandle();
		
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
		
		
		//Get all dynamic Window ID's open throw webdriver session
		Set<String> All_Win_IDS=driver.getWindowHandles();   
		for (String SingleId : All_Win_IDS)    //When set has  many windows open it follow random order
		{
			//This line will switch to every window 
			driver.switchTo().window(SingleId);
			
			//Capture every window current title after switch appliced
			String Runtime_title=driver.getTitle();
			
			if(Runtime_title.contains("Seat Availability"))   //Expected title
			{
				break;    //It break foreach loop iteration and keep control when it title match
			}
			
		}
		
		
		System.out.println("Current focued window is --> "+driver.getTitle());
		
		
		

	}

}
