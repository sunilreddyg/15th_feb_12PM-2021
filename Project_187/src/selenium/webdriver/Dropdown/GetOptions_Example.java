package selenium.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions_Example 
{
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://v1.hdfcbank.com/branch-atm-locator/?lat=");
		driver.manage().window().maximize();
		
		Select State_Dropdown_selector=new Select(driver.findElement(By.id("customState")));
		int Count=State_Dropdown_selector.getOptions().size();
		System.out.println("Number of options available at dropdown is ---> "+Count);
		
	}

}
