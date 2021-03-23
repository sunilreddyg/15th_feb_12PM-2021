package ui_verificationCommands.getAttribute;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_Current_SystemDate {

	public static void main(String[] args) throws Exception {
		
		
		/*
		 * Sceario:--> verify departue date matching with current system date
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement Departure_Date=driver.findElement(By.xpath("//input[contains(@name,'date1')]"));
		//Get Input Value from textbox
		String Departure_date=Departure_Date.getAttribute("value");
		System.out.println("Defautl Depareture date foramt is --> "+Departure_date);
		

		//Get Current System Date
		Date d=new Date();
		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM");
		//Convert system date using simple date formatter
		String Sdate=sdf.format(d);
		System.out.println("System date in depareture date frmt---> "+Sdate);
		
		
		//Verify System date equals to Departure date
		if(Sdate.equals(Departure_date))
			System.out.println("Testpass, Departure date match with system date");
		else
			System.out.println("Testfail departure date mismatch with system date");
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

	}

}
