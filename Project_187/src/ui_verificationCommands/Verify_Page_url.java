package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Page_url {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.dev");
		driver.manage().window().maximize();
		
		//Get current page title
		String Runtime_url=driver.getCurrentUrl();
		System.out.println("Currnet page url is --> "+Runtime_url);
		
		String Exp_url="https://www.selenium.dev/";
		
		//verify Url presented at page
		if(Runtime_url.contains(Exp_url))
		{
			System.out.println("Url verified for homepage");
		
			WebElement Download_link=driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[1]"));
			Download_link.click();
			
			//Verify downloads page url
			if(driver.getCurrentUrl().contains("downloads/"))
				System.out.println("Expected url verified");
			else
				System.err.println("Url mismatch for Downloads page");
		}
		else
			System.out.println("Wrong url presented");
		

	}

}
