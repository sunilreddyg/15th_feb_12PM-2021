package ui_verifactioncommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_page_url_At_Webpage {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.selenium.dev/");
		driver.manage().window().maximize();
		
		
		//Verify Secured page displayed
		String Runtime_url=driver.getCurrentUrl();
		if(Runtime_url.contains("https://"))
			System.out.println("Page is secured url presented --> "+Runtime_url);
		else
			System.out.println("page not secuted url presented ---> "+Runtime_url);
			
	
		
		WebElement Downlaods_link=driver.findElement(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"));
		Downlaods_link.click();
		
		
		if(driver.getCurrentUrl().contains("downloads/"))
		{
			System.out.println("Downlaod page url verified");
		}
		else
		{
			System.out.println("Downlaod page url not verified");
		}
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		/*
		 * In Junit/Testng framework we follow assert command insted of conditions:-->
		 * 
		 * 			Assert.AssertEquals(Expected,Actual);
		 */
	
		
		
		
		
		
		
		
		
		
		

	}

}
