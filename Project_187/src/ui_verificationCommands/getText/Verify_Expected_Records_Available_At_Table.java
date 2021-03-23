package ui_verificationCommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Expected_Records_Available_At_Table {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/equity");
		driver.manage().window().maximize();
		
		
		//Target table
		WebElement Table=driver.findElement(By.id("tblMarketToday"));
		//Get Entire text available at table
		String Table_text=Table.getText();
		
		//Verify expected record available at table
		if(Table_text.contains("JSW Steel"))
			System.out.println("Record available at top shares");
		else
			System.out.println("Record not available at top shares");
	}

}
