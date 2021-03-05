package selenium.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Multiple_SelectionType {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * FAQ:--> Verify dropdown is a multiple selection type
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://v1.hdfcbank.com/branch-atm-locator/?lat=");
		driver.manage().window().maximize();
		
		//This command only works for <select> tag element
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Multiple selection state is ---> "+flag);
		
		
		/*
		 * Note:--> This is a sample program just for understanding
		 *  => Create Multiple Selection Dropdown using Javascript.
		 */
		((JavascriptExecutor)driver).executeScript("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		//This command only works for <select> tag element
		boolean flag1=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Multiple selection state is ---> "+flag1);
		
		

	}

}
