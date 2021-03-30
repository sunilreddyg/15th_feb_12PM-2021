package switchcommands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Verify_Alert_presented_At_Webpage_Using_Condition {

	public static void main(String[] args) throws Exception 
	{
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	   // Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    
	    //verify Alert presented using Condition
	    if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
	    {
	    	System.out.println("alert presented");
	    }
	    else
	    {
	    	System.out.println("alert not presented");
	    }
	    
	    
	    /*
	     * Whenever use expectectedconditions class without webdriverwait
	     * we should attach apply command at end of the statement
	     */
	    
	    
	    
	    
	  
		
		

	}

}
