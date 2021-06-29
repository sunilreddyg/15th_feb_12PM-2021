package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Using_Conditions {

	public static void main(String[] args) throws IOException 
	{
		
		/*
		 * Execute only selected testcase instead of read all rows data
		 */
		
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\BOOK.xlsx");
		System.out.println("file located");
		
		//Get Workbook access using above fileinput stream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using book
		XSSFSheet sht=book.getSheet("Conditions");
		
		//Get First and Last Row Cell count where data exist
		int Firstrownum=sht.getFirstRowNum();      //it return at what index data availabel in first row
		int Lastrownum=sht.getLastRowNum();		   //it return at what index data available in last row
		
		
		//Iterate for number of rows data available
		for (int i = Firstrownum+1; i < Lastrownum+1; i++) 
		{
			
			
			String exe_status=sht.getRow(i).getCell(2).getStringCellValue();
			
			if(exe_status.equalsIgnoreCase("y"))
			{
				//Get usernaem and password from static cells
				String Username=sht.getRow(i).getCell(0).getStringCellValue();
				String Password=sht.getRow(i).getCell(1).getStringCellValue();
				System.out.println(Username+"   "+Password);
			}
			
	
			
		}
				
				
		

	}

}
