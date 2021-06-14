package findelements.webtable;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_WebTable_Data_Using_SpecificRow_And_Cell {

	public static void main(String[] args) 
	{
		
		/*
		 * FAQ:--> Reading data from static row and static cell
		 */
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/equity");
		driver.manage().window().maximize();
		
		
		
		//Target table
		WebElement table=driver.findElement(By.id("tblMarketToday"));
		
		//Find list of rows available in table..
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("Number of rows availabe is ----> "+rows.size());
		
		//Remove First Row [Header row]
		rows.remove(0);
		
		//Target Specific row
		WebElement SelectedRow=rows.get(2);
		System.out.println(SelectedRow.getText());
		
		
		//Find list of Cells under Selected row
		List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
		
		
		//Target Required cell using it's index number
		String CompanyName=cells.get(0).getText();
		String LTP_Value=cells.get(1).getText();
		String Recent_Change=cells.get(2).getText();
		String Volume=cells.get(3).getText();
		String Turnover=cells.get(4).getText();
		
		System.out.println(CompanyName+"\n"+LTP_Value+"\n"+Recent_Change+"\n"+Volume+"\n"+Turnover);
		
		

	}

}
