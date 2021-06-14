package pageobjects.With_PageFactory;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class GetPageFactory_Resuable_Methods {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		
		RDIF_SIGNUP signup=PageFactory.initElements(driver, RDIF_SIGNUP.class);
		signup.Check_Email_Availability("MQDBBDA", "bq123");

	}

}
