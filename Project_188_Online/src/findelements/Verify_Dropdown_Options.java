package findelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Dropdown_Options {

	public static void main(String[] args) throws Exception 
	{
		
		
		/*
		 *  1. visit site  https://v1.hdfcbank.com/branch-atm-locator/
		 *  2. Select Each state option from dropdown
		 *  3. And verify at least one respective city displayed according to state selection..
		 */
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		
		String Exp_Cities[]= 
			{
				"Please select state first",
				"Port Blair",
				"South Andaman",
				"jdfjldjf",      //wrong City
				"East Siang",
				"Barpeta",
				"Araria",
				"Chandigarh",
				"Champa",
				"Dadra",
				"Naroli",
				"Daman",
				"dsfjldjf",     //Wrong City
				"Ponda",
				"Ahmedabad",
				"Ambala",
				"Baddi",
				"Anantnag",
				"Anantnag",
				"Bokaro",
				"Bagalkot",
				"Adoor",
				"Ashok Nagar"
				
				
			};
		
		
		
		WebElement State_Dropdown=driver.findElement(By.xpath("//select[@id='customState']"));
		List<WebElement> All_options=State_Dropdown.findElements(By.tagName("option"));
		System.out.println("List of options available in dropdown --> "+All_options.size());
		
		
		for (int i = 0; i < 22; i++) 
		{
			
			WebElement Each_Option=All_options.get(i);
			String OptioName=Each_Option.getText();
			//System.out.println(OptioName);
			
			Each_Option.click();
			Thread.sleep(3000);
			
			
			WebElement CityDropdown=driver.findElement(By.xpath("//select[@id='customCity']"));
			String Act_Cities=CityDropdown.getText();
			//System.out.println("\n");   //Create new line at console
			
			
			if(Act_Cities.contains(Exp_Cities[i]))
			{
				System.out.println(OptioName+"\t"+"Required State Displayed"+"\t"+Exp_Cities[i]);
			}
			else
			{
				System.out.println(OptioName+"\t"+"State not Displayed"+"\t"+Exp_Cities[i]);
			}
			
			
			
			
			
		}
		
		
		
		
		

	}

}
