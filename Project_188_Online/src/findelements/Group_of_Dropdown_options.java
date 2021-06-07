package findelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_of_Dropdown_options
{

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		
		WebElement State_Dropdown=driver.findElement(By.xpath("//select[@id='customState']"));
		List<WebElement> All_options=State_Dropdown.findElements(By.tagName("option"));
		System.out.println("List of options available in dropdown --> "+All_options.size());
		
		
		for (int i = 0; i < All_options.size(); i++) 
		{
			
			WebElement Each_Option=All_options.get(i);
			String OptioName=Each_Option.getText();
			System.out.println(OptioName);
			
			Each_Option.click();
			Thread.sleep(500);
			
		}
		
		
		
		
		
		
		
		
		

	}

}
