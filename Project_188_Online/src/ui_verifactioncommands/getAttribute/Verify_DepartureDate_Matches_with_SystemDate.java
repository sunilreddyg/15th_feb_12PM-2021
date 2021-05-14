package ui_verifactioncommands.getAttribute;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_DepartureDate_Matches_with_SystemDate {

	public static void main(String[] args) 
	{
		
		/*
		 * Scenario:  Verifying departuredate matches with System date
		 * 		Given site url is  "http://spicejet.com"
		 * 		Then verify departure date matches with current system date.
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		WebElement Departure_Textbox=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		String DDate=Departure_Textbox.getAttribute("value");
		System.out.println(DDate);
		
		
		//write java program to get default system time
		Date d=new Date();   //import java.util.Date;
		System.out.println(d.toString());
		//Create simple date format   im  [day/month]
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM");
		//convert default system date using Simple date formatter
		String SDate=sdf.format(d);
		
		
		//Verify Departue dae matches with system date
		if(DDate.equals(SDate))
			System.out.println("Testpass, Departe date showing current system date");
		else
			System.out.println("Testfail,Departe date showing diffent date other than system date");
		
		
		/*
		 * Date formatters:-->
		 * 
		 * 		yyyy =>    year   [2019]
		 * 		  yy =>    year   [19]
		 * 		  MM =>    Month  [01-12]
		 * 		MMM  =>    Month  [Jan -Dec]
		 * 		EEE  =>    week   [sun -sat]
		 * 		  dd =>    date   [01-31]
		 * 		  hh =>    hour   [01-24]
		 * 		  mm =>    minute [01-60]
		 * 		  ss =>    Seconds[01-60]
		 * 		
		 */
	    
	    
	    /*
		 * 		Scenario:
		 * 				Verifying Departure date editbox status
		 * 				
		 * 				Given site url "https://www.spicejet.com/"
		 * 				Then verify Departure date editbox is readonly on browser launch
		 */
	    
	    /*
  		 * 		Scenario:
  		 * 				Verifying Departure date editbox status
  		 * 				
  		 * 				Given site url "https://www.spicejet.com/"
  		 * 				When user open Departure date calendar
  		 * 				And select any new date
  		 * 				Then verify selected date populated at Departure editbox.
  		 */
	    
	    
	    
		
		
		
		

	}

}
