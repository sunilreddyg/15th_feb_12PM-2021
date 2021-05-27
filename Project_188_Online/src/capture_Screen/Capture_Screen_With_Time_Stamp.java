package capture_Screen;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Screen_With_Time_Stamp {

	public static void main(String[] args) throws Exception
	{
		
		
		
		
		
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		
		//Get Current system time
		Date d=new Date();
		DateFormat df=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss");
		String time=df.format(d);
		
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("screens\\"+time+"naukri.png"));
		
		
		/*
		 * Selenium override screen inorder to create new screen we had to add
		 * time stamp to file name.
		 */
		
		
		
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
