package framework.Datadriven.Excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_Data_into_Excel 
{

	public static void main(String[] args) throws IOException 
	{
		
		
		//Create new output file
		String outputfile="TestData\\Output.xlsx";
		FileOutputStream fo=new FileOutputStream(outputfile);
		System.out.println("File Created");
		
		XSSFWorkbook book=new XSSFWorkbook();
		System.out.println("New Worbook created");
		
		XSSFSheet sht=book.createSheet("Output_Sheet");
		System.out.println("Sheet Created");
		
		XSSFRow row1=sht.createRow(1);
		System.out.println("Row Created in excel");
		
		row1.createCell(0).setCellValue("Testname");
		row1.createCell(1).setCellValue("Result");
		
		//Write Book data into file
		book.write(fo);
		book.close();
		System.out.println("Writing Runtime Data into Excel file completed");
	}

}
