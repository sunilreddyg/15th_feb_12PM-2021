package corejava.Loops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Do_while 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		
		//Do-while with false condition
		do {
			
			System.out.println("Once it is Executed even condition was false");
			
		} while (false);
		
		
		
		//True Condition
		int i=100;
		do {
			i=i+1;
			System.out.println(i);
			
		} while (i < 10);
		
		
		
		
		/*
		 * FAQ:--> Using Do-while reload webpage when page load not successfull at first time.
		 */
		
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		boolean flag=false;
		int count=0;
		do {
			
			driver.get("http://google.com");
			
			try {
				flag=wait.until(ExpectedConditions.titleIs("SeleniumHQ Browser Automation"));
				System.out.println("page loaded successfully");
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			count=count+1;
			if(count==5)
			{
				throw new Exception("Failed to laod page, Tryed max 5 attempts");
			}
			
			
		} while (flag==false);
		
		
	}

}
