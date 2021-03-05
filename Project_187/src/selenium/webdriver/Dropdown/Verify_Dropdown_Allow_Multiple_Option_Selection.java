package selenium.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Allow_Multiple_Option_Selection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://v1.hdfcbank.com/branch-atm-locator/?lat=");
		driver.manage().window().maximize();
		
		/*
		 * Note:--> This is a sample program just for understanding
		 *  => Create Multiple Selection Dropdown using Javascript.
		 */
		((JavascriptExecutor)driver).executeScript("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		//This command only works for <select> tag element
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Multiple selection state is ---> "+flag);
		
		
		//Decision statemenet to accept on multiple selection type only
		if(flag==true)
		{
			System.out.println("Dropdown is multiple selection type");
			Select State_Dropdown=new Select(driver.findElement(By.id("customState")));
			State_Dropdown.deselectAll();   //This command only works when dropdown is multiple selection type
			State_Dropdown.selectByIndex(3);
			State_Dropdown.selectByIndex(6);
			State_Dropdown.selectByIndex(9);
			
			int Count=State_Dropdown.getAllSelectedOptions().size();
			if(Count > 1)     //nested if condition
			{
				System.out.println("Dropdown Accept more than one option to select");
			}
			else
			{
				System.out.println("Dropdown failed to selected multiple options");
			}
			
			
		}
		else
		{
			System.out.println("Dropdown is not a multiple selection type");
		}
		
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
