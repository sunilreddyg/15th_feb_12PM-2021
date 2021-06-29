package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Data_From_Multiple_Rows
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\BOOK.xlsx");
		System.out.println("file located");
		
		//Get Workbook access using above fileinput stream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using book
		XSSFSheet sht=book.getSheet("multiple");
		
		//Get First and Last Row Cell count where data exist
		int Firstrownum=sht.getFirstRowNum();      //it return at what index data availabel in first row
		int Lastrownum=sht.getLastRowNum();		   //it return at what index data available in last row
		
		
		//Iterate for number of rows data available
		for (int i = Firstrownum+1; i < Lastrownum+1; i++) 
		{
			
			//Get usernaem and password from static cells
			String Username=sht.getRow(i).getCell(0).getStringCellValue();
			String Password=sht.getRow(i).getCell(1).getStringCellValue();
			System.out.println(Username+"   "+Password);
			
			
		}
		
		

	}

}
