package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWati_Element_Selection_False 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");    
		driver.manage().window().maximize();
		
		
		//Enable explicit wait on automation browser
		WebDriverWait wait=new WebDriverWait(driver, 100);
		
		By Male_radio_button=By.xpath("//input[@value='m']");
		wait.until(ExpectedConditions.elementSelectionStateToBe(Male_radio_button, false));
		System.out.println("Male radio button selection status is false");

	}

}
