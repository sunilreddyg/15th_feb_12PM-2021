package waitcommands;


import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Waits {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		
		//Enable explicit wait on automation browser
		WebDriverWait wait=new WebDriverWait(driver, 50);
		
		
		//wait for the title
		String page_title="SeleniumHQ Browser Automation";
		wait.until(ExpectedConditions.titleIs("SeleniumHQ Browser Automation"));
		System.out.println("Title is verified");
		
		
		//wait for the url
		String page_url="https://www.selenium.dev/";
		wait.until(ExpectedConditions.urlToBe(page_url));
		System.out.println("Url is verified");
		
		
		
		//wait for Element to visible.. [Recomended for pageobject syntax]
		WebElement Download_button=driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[1]"));
		wait.until(ExpectedConditions.visibilityOf(Download_button));
		System.out.println("object visible at webpage");
		
		//Wait for Elemen to visible.. [Recomended for Regular syntax]
		By Menu_locator=By.xpath("//a[@id='dropdownButton']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Menu_locator));
		System.out.println("Object visiblet at webpage");
		
		
		
		
		
	}

}
