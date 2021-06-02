package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_Presenceof_Element {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");    
		driver.manage().window().maximize();
		
		
		//Enable explicit wait on automation browser
		WebDriverWait wait=new WebDriverWait(driver, 100);

		
		
		
		//managing timeout to load at backend html source
		By email_locator=By.id("email");
		wait.until(ExpectedConditions.presenceOfElementLocated(email_locator));
		System.out.println("Timeout released location presented at DOM [Document object model]");
		
		

	}

}
