package corejava.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Links
{
	
	public static void main(String args[]) throws Exception
	{
		/*
		 * 1. Click Eachlink under footer links 
		 * 2. Read title of the page
		 */
		
	
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
				
		String links[]={"Sign Up","Log In","Messenger","People"
						,"Pages","Games","Terms","Services","Careers","Cookies","Jobs","Developers"};
		
		
		for (int i = 0; i < links.length; i++) 
		{
			
			driver.findElement(By.linkText(links[i])).click();
			Thread.sleep(2000);
			
			System.out.println(links[i]+"\t"+"\t"+driver.getTitle());
			
			driver.navigate().back();
			Thread.sleep(2000);
			
		}
		
		
		
	}

}
