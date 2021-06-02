package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_Object_Invisibility {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		
		//Enable explicit wait on automation browser
		WebDriverWait wait=new WebDriverWait(driver, 100);
		
		
		//wait for Element to hidden.. [Recomended for pageobject syntax]
		WebElement Element=driver.findElement(By.xpath("//input[@id='email']"));
		wait.until(ExpectedConditions.invisibilityOf(Element));
		System.out.println("Timeout Released object is hidden at webpage");
		
		
		By Pwd_locator=By.xpath("//input[@id='pass']");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(Pwd_locator));
		System.out.println("Timeout released password object hidden at webpage");

	}

}
