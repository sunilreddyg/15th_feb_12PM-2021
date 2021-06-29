package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Testcase_With_Excel_Data 
{

	public static void main(String[] args) throws IOException
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\BOOK.xlsx");
		System.out.println("file located");
		
		//Get Workbook access using above fileinput stream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using book
		XSSFSheet sht=book.getSheetAt(0);
		
		
		//Get String data from cells
		String URL=sht.getRow(1).getCell(0).getStringCellValue();
		String browsername=sht.getRow(1).getCell(1).getStringCellValue();
		String browser_type=sht.getRow(1).getCell(2).getStringCellValue();
		String username=sht.getRow(3).getCell(0).getStringCellValue();
		String password=sht.getRow(3).getCell(1).getStringCellValue();
		
		
		
		WebDriver driver=null;
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
			driver=new ChromeDriver();

		}else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "browser_drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		
		driver.get(URL);
		
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		
		
	}

}
