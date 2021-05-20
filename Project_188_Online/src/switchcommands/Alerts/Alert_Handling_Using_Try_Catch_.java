package switchcommands.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling_Using_Try_Catch_ {

	public static void main(String[] args) 
	{
		/*
		 * Scenario:-->
		 * 			Job Search with invalid details
		 * 		Given site url is "https://www.firstnaukri.com/"
		 * 		When user click search button witout enter data
		 * 		Then display popup window "Please select a Course or enter a Keyword"
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
	    driver.manage().window().maximize();
		
		//Identify search button
	    WebElement Search_btn=driver.findElement(By.xpath("//input[@type='submit']"));
	    Search_btn.click();
	    
	    
	    try {
	    	
	    	//Switch to Alert
		    Alert alert=driver.switchTo().alert();
		    //Capture text presented at alert
		    String Act_msg=alert.getText();
		    System.out.println(Act_msg);
		    
		    //Accept alert window [Click ok button at Alert window]
		    alert.accept();
	    	
		} catch (NoAlertPresentException e) {
			System.out.println("alert not presented");
		}
	    
	    System.out.println("Run continued");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
