package selenium.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelected_Option {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://v1.hdfcbank.com/branch-atm-locator/?lat=");
		driver.manage().window().maximize();
		
		Select State_Dropdown_selector=new Select(driver.findElement(By.id("customState")));
		State_Dropdown_selector.selectByIndex(4);
		
		String OptionText=State_Dropdown_selector.getFirstSelectedOption().getText();
		System.out.println(OptionText);
		
		/*
		 * GetFirstSelectedOption:-->
		 * 		Is a select class mehtod it return first Selected Option 
		 * 		as WebElement.
		 * 
		 * 		getText() is a WebElement Class Method it capture text available
		 * 		location
		 */
		
	}

}
