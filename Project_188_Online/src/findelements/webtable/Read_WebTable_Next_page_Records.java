package findelements.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_WebTable_Next_page_Records 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/exchange-traded-funds-etf");
		driver.manage().window().maximize();
		
	
		WebElement Next_btn=driver.findElement(By.id("bestETFLong_next"));
		String Runtime_Class=Next_btn.getAttribute("class");
		
		
		do {
	

			WebElement table=driver.findElement(By.id("bestETFLong"));
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			rows.remove(0);   //To Remove header in table
			
			for (WebElement Eachrow : rows) 
			{
				List<WebElement> cells=Eachrow.findElements(By.tagName("td"));
				String FundName=cells.get(0).getText();
				System.out.println(FundName);
			}
			
			
			Next_btn.click();
			Thread.sleep(5000);
			
			
			Next_btn=driver.findElement(By.id("bestETFLong_next"));
			Runtime_Class=Next_btn.getAttribute("class");
		
			
		} while (!Runtime_Class.contains("disabled"));
		
			
			
			
			
		
		
		
		
		
		
		
		

	}

}
