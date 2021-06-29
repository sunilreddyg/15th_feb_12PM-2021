package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Boolean_And_Data_Cell_Values 
{

	public static void main(String[] args) throws IOException 
	{
		
		

		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\BOOK.xlsx");
		System.out.println("file located");
		
		//Get Workbook access using above fileinput stream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using book
		XSSFSheet sht=book.getSheet("Numerics");
		
		
		//Get Data form excel cell
		Date Exp_Date=sht.getRow(4).getCell(0).getDateCellValue();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyy");
		System.out.println(sdf.format(Exp_Date));
		
		
		//Get Boolean value from cell
		boolean flag=sht.getRow(4).getCell(1).getBooleanCellValue();
		System.out.println("boolean vlaue is ---> "+flag);
		
		
		

	}

}
