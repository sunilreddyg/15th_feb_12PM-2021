package switchcommands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Steps to automate:-->
		 * 		1.Open cleartrip website
		 * 		2.Navigate Manage trips webpage
		 * 		3.Enter email 
		 * 		4.Enter TripId
		 * 		5.Click button 
		 */
		
		
		//Step1
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.manage().deleteAllCookies();
		driver.get("https://www.cleartrip.com");  
		driver.manage().window().maximize();  
		
		
		//Step2
		WebElement ManageTrip=driver.findElement(By.xpath("//a[@href='/account/trips?src=manageTrips']"));
		ManageTrip.click();
		Thread.sleep(4000);  //Static timeout to load frame..
		
		
		/*
		 * Note:-->In selenium inorder to indefiy frame under objects we need to 
		 * 		   switch to frame first.
		 */
		 driver.switchTo().frame("modal_window");
		
		
		
		//Step3   [This object is under frame]
		WebElement Email_textbox=driver.findElement(By.xpath("//input[@id='email']"));
		Email_textbox.clear();
		Email_textbox.sendKeys("sunilreddy@gmail.com");
		
		
		//Step4  [This object is under frame]
		WebElement TripId=driver.findElement(By.id("tripidSecond"));
		TripId.clear();
		TripId.sendKeys("876866879878");
		
		
		/*
		 * Note:--> Once your job done under frame, you can switch controls back
		 * 			to mainpage.
		 */
		driver.switchTo().defaultContent();    //It works only for frame..
		
		
		//IDentify Feedback link under page
		WebElement Feedback_link=driver.findElement(By.xpath("//a[contains(.,'Feedback')]"));
		Feedback_link.click();
		Thread.sleep(2000);
		
		
		/*
		 * Note:-->In selenium inorder to indefiy frame under objects we need to 
		 * 		   switch to frame first.
		 */
		 driver.switchTo().frame(1);     //Index number starts from zero
		 
		
		
		
		WebElement FeedBackEmail=driver.findElement(By.name("email_address"));
		FeedBackEmail.clear();
		FeedBackEmail.sendKeys("sunil@gmail.com");
		
		
		
		

	}

}
