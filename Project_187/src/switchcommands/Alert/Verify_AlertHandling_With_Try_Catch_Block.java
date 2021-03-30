package switchcommands.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_AlertHandling_With_Try_Catch_Block {

	
	
	public static void main(String[] args) throws Exception 
	{
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    
	  	try {
	  		
	  	//Switching to alert and wrapped alert into Interface class
		Alert alert=driver.switchTo().alert();
		    
		 //Get text on alert
		  String alert_msg=alert.getText();
		  System.out.println(alert_msg);
		    
		  //Close alert
		  alert.accept();  //This line close alert and bring controls back to webpage
		    
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	    	
	
	    System.out.println("Alert handled");
	    driver.close();
	    
	    

	}

}
