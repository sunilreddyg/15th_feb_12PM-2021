package framework.Datadriven.Excel;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Excel {

	public static void main(String[] args) throws Exception 
	{
		
		//Target Binary file location
		FileInputStream fi=new FileInputStream("TestData\\InputBook.xlsx");
		System.out.println("file located");
		
		//Get Workbook access using above file location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet access using workbook reference
		XSSFSheet sht=book.getSheet("Info");
		
		//Get row access using sheet refernce
		XSSFRow row=sht.getRow(1);
		
		//Get cell access using row reference
		XSSFCell cell0=row.getCell(0);
		
		//Read characters from cell
		String URL=cell0.getStringCellValue();
		System.out.println(URL);
		
		
		//Get browser name
		String BrowserName=row.getCell(1).getStringCellValue();
		System.out.println(BrowserName);
		
		
		//Get Type of browser  [Without using variable reference]
		String BrowserType=sht.getRow(1).getCell(2).getStringCellValue();
		System.out.println(BrowserType);
		
				

	}

}
