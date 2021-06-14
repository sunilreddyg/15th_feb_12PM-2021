package pageobjects.With_PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class Get_PageFactory_Object 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		
		
		/*
		 * Note:-->
		 * 		Inorder to @FindBy objects into different class we can access
		 * 		only with help of pagefactory class.
		 */
		
		RDIF_SIGNUP signup=PageFactory.initElements(driver, RDIF_SIGNUP.class);
		signup.Create_account_page_link.click();
		
		signup.Fullname_TB.clear();
		signup.Fullname_TB.sendKeys("MQBQDB");
		
		signup.Choose_A_rediffMail_TB.clear();
		signup.Choose_A_rediffMail_TB.sendKeys("bq123");
		
		signup.Check_availability_BTN.click();
		Thread.sleep(5000);
		
		String Email_Status_info=signup.Check_Availability_TEXT.getText();
		System.out.println(Email_Status_info);
		
		
		

	}

}
