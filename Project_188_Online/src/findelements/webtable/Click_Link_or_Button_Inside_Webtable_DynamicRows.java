package findelements.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Link_or_Button_Inside_Webtable_DynamicRows {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/exchange-traded-funds-etf");
		driver.manage().window().maximize();
		
		
		//Target table
		WebElement table=driver.findElement(By.xpath("//tbody[contains(@id,'indicesSchemeTbody')]"));
		//Find list of rows available in table..
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("Number of rows availabe is ----> "+rows.size());
		
		
		//Apply foreach  [Not matters what loop it is]
		for (WebElement Eachrow : rows)
		{
			
			String RowText=Eachrow.getText();
			if(RowText.contains("CPSE-ETF"))
			{
				
				Eachrow.findElements(By.tagName("td")).get(8).findElement(By.tagName("a")).click();
				break;
				
			}
			
		}

	}

}
