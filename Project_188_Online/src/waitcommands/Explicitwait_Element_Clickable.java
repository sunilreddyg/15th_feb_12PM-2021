package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_Element_Clickable 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://practice.automationtesting.in/my-account/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Enable explicit wait on automation browser
		WebDriverWait wait=new WebDriverWait(driver, 100);

		
		//Wait element to be clickable..
		By Register_btn=By.xpath("By.xpath(\"//input[@value='Register']\")");
		wait.until(ExpectedConditions.elementToBeClickable(Register_btn));
		System.out.println("Register button status is clickable");
		
		
		
	}

}
