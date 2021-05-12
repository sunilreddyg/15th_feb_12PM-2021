package ui_verifactioncommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Verify_Any_Single_Link_Available_At_Group_Link 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		WebElement Footer_Area=driver.findElement(By.id("pageFooterChildren"));
		String all_footer_links=Footer_Area.getText();
		
		
		//Decision to verify expected link available at footer link
		if(all_footer_links.contains("Fundraisers"))
		{
			System.out.println("Testpass, Link available at footer links");
		}
		else
		{
			System.out.println("Testfail, LInk not available at footer links ");
		}
		
		
		
		
	}

}
