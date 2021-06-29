package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Numeric_Values_From_Excel {

	public static void main(String[] args) throws IOException
	{
		
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\BOOK.xlsx");
		System.out.println("file located");
		
		//Get Workbook access using above fileinput stream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using book
		XSSFSheet sht=book.getSheet("Numerics");
		
		
		//Get Set of characters from Excel cell
		String productName=sht.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Productname is ----> "+productName);
		
		//Get Numeric characters from excel cell
		double ProdcutId=sht.getRow(1).getCell(1).getNumericCellValue();
		System.out.println(ProdcutId);
		
		/*
		 * Converting double format to string
		 */
		 String PrdouctID_In_String=NumberToTextConverter.toText(ProdcutId);
		 System.out.println(PrdouctID_In_String);
		
		
		/*
		 * Converting double format to integer
		 */
		Double dble=new Double(ProdcutId);
		long ProductID_in_long=dble.longValue();
		System.out.println(ProductID_in_long);
		
		
		//Read Double value from excel cell
		double ProductPrice=sht.getRow(1).getCell(2).getNumericCellValue();
		System.out.println("product price in double format ==>"+ProdcutId);
		
		
		//Read Numerices from excel cell
		Double Quantity_In_Dble=sht.getRow(1).getCell(3).getNumericCellValue();
		System.out.println("Double to integer --> "+Quantity_In_Dble.intValue());

	}

}
