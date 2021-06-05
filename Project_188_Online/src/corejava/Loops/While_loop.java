package corejava.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_loop 
{

	public static void main(String[] args) throws Exception 
	{
		
		
	//print numbers from 1 to 10.
	 int i=0;
	 while(i < 10)
	 {
		
		 i=i+1;
		 System.out.println(i);
	 }
	 
	 
	 //Print values in reverse
	 int j=10;
	 while(j >= 1)
	 {
		 
		 System.out.println(j);
		 j=j-1;
		 
	 }
	 
	 
	 
	 /*
	  * Manage explicit wait using while loop.
	  */
	 
	 
	//Example:--> Using while loop manage explicit wait.
	System.setProperty("webdriver.chrome.driver",  "browser_drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/r.php");
	driver.manage().window().maximize();
	
	
	WebElement Retype_Email=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
			
	int count = 0;
	while(!Retype_Email.isDisplayed())
	{
		System.out.println("object not visible");
		Thread.sleep(1000);   //For every iteration it will wait for one second
		
		if(count==30) 
		{
			throw new Exception("waited 30 second still object not visible");
		}
		count=count+1;
	}
	 
	System.out.println("Object visible");
	 
	 
	 
	 
		

	
	}
}
