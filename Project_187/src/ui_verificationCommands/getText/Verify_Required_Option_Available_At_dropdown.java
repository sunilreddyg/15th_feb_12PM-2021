package ui_verificationCommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Required_Option_Available_At_dropdown {

	public static void main(String[] args) throws Exception {
		
		
		/*
		 * Scenario:-->
		 * 			Verify Citydropdown displayed City names 
		 * 			according to state selection
		 * 
		 * 			Given site url 
		 * 			When user select any state
		 * 			Then verify expected cities listout at City Dropdown
		 */
		
		
			
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		//Select State dropdown
		Select State_dropdown=new Select(driver.findElement(By.id("customState")));
		State_dropdown.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(5000);
		
		WebElement City_drodpwon=driver.findElement(By.xpath("//select[@id='customCity']"));
		//Read all City Dropdown options
		String All_Cities=City_drodpwon.getText();
		//System.out.println(All_Cities);
		
		//Verify Expected city available under state dropdown
		if(All_Cities.contains("Guntur"))
			System.out.println("Testpass, Expected city available at dropdown");
		else
			System.out.println("Testfail, Expected city not available at dropdown");
	}

}
