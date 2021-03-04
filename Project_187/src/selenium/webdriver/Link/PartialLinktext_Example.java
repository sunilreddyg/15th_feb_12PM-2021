package selenium.webdriver.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinktext_Example 
{

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://cleartrip.com");
		driver.manage().window().maximize();
		
		
		/*
		 * HtmlSource:-->
		 * 		<a href="javascript:void(0);" class="weak" id="MoreOptionsLink" tabindex="11" title="More search options">
					<strong>More options:</strong> 
					Class of travel, Airline preference
				</a>
		 */
		
		//click link using partial linkname
		driver.findElement(By.partialLinkText(" Class of travel, Airline preference")).click();
		
		
		

	}

}
