package waitcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_Element_presented {

	public static void main(String[] args) {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();						
		driver.get("http://demo.automationtesting.in/Alerts.html"); 
		driver.manage().window().maximize();  						
				
				
		WebElement Alert_link=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		Alert_link.click();  //This Line of code prompt alert at webpage.
		
		
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		
	
		System.out.println(alert.getText());    //Get text on alert and printing at console
		alert.accept();							//Close alert window
		

	}

}
