package switchcommands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Switch_BetWeen_Frames 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		/*
		 * Step1:--> Open site  https://epass.apcfss.in/
		 * Step2:--> Click on feestructure button
		 * Step3:--> Select university from dropdown
		 * Step4:--> Select Course from dropdown
		 * Step5:--> Select Course year from dropdown
		 * Step6:--> Select Academic year from dropdown
		 * Step7:--> Click Get Report option
		 */
		
		//Step1
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://epass.apcfss.in/");
	    driver.manage().window().maximize();
	    
	    
	    //Step2
	    driver.switchTo().frame("menuFrame");  //It take controls to menuframe from webpage
	    WebElement FeeStructure=driver.findElement(By.xpath("//a[@href='FeestructureReport.do']"));
	    FeeStructure.click();
	    Thread.sleep(3000);  //Static timegap to load frame..
	    
	    
	    //Step3
	    driver.switchTo().defaultContent();   //It brings control from menuframe to webpage	
	    driver.switchTo().frame("bodyFrame"); //It take control from webpage to bodyframe
	    new Select(driver.findElement(By.xpath("//select[@id='univ']"))).selectByVisibleText("ANDHRA UNIVERSITY");
	    Thread.sleep(4000);  //Static timegap to load options at course dropdown
	    
	    
	    //Step4
	    WebElement CourseName = driver.findElement(By.id("coursesId"));
	    CourseName.findElement(By.xpath("//option[. = 'BA']")).click();
	    Thread.sleep(4000);
	    
	    //step5
	    WebElement CourseYear = driver.findElement(By.id("courseYearId"));
	    CourseYear.findElement(By.xpath("//option[. = '2']")).click();
	    Thread.sleep(4000);
	    
	    
	    //Step6
	    WebElement Account_Year = driver.findElement(By.name("ac_year"));
	    Account_Year.findElement(By.xpath("//option[. = '2010-11']")).click();
	    
	    
	    //Step7
	    driver.findElement(By.name("submit")).click();
	    
		
		
		//Switch Control to mainpage
	    driver.switchTo().defaultContent();  //It Bring controls from bodyframe to mainpage

	}

}
