package framework.Datadriven.Excel;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Get_Cell_types 
{

	public static void main(String[] args) throws Exception {
		
		
		/*
		 * Faq:--> How to read data from multiple rows when comibination of data
		 * 		   available numers,characters,boolean,date  ---etc
		 */
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\BOOK.xlsx");
		System.out.println("file located");
		
		//Get Workbook access using above fileinput stream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using book
		XSSFSheet sht=book.getSheet("mixeddata");
		
		//Get First and Last Row Cell count where data exist
		int Firstrownum=sht.getFirstRowNum();      //it return at what index data availabel in first row
		int Lastrownum=sht.getLastRowNum();		   //it return at what index data available in last row
		
		
		//Iterate for number of rows data available
		for (int i = Firstrownum+1; i < Lastrownum+1; i++) 
		{
			
			
			XSSFCell Firstcell=sht.getRow(i).getCell(0);
			
			String Username=null;
			
			if(Firstcell.getCellType()==CellType.STRING)
			{
				Username=Firstcell.getStringCellValue();
			}
			else if(Firstcell.getCellType()==CellType.NUMERIC)
			{
				Double dble=Firstcell.getNumericCellValue();
				Username=NumberToTextConverter.toText(dble);
			}
			else if(Firstcell.getCellType()==CellType._NONE)
			{
				Username="";
			}
			
			
			System.out.println(Username);
			
			
			
			
		}

	}

}
