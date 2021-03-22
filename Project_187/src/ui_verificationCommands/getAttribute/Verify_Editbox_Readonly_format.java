package ui_verificationCommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Editbox_Readonly_format {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement Departure_editbox=driver.findElement(By.xpath("//input[contains(@id,'date1')]"));
		String Runtime_Readonly_status=Departure_editbox.getAttribute("readonly");
		System.out.println(Runtime_Readonly_status);
		
	
			if(Runtime_Readonly_status.equals("true"))
			{
				System.out.println("Testpass, As expected Deaparture editbox is readonly");
			}
			else
			{
				System.out.println("TestFail,Departure editbox is in writable mode");
			}
			
			
		
	}
}

