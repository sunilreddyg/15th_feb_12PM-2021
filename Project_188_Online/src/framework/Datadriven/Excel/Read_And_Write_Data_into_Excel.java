package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_And_Write_Data_into_Excel {

	public static void main(String[] args) throws IOException 
	{
		
		
		String filepath="TestData\\Book.xlsx";
		FileInputStream fi=new FileInputStream(filepath);
		
		//Get Existing workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using book
		XSSFSheet sht=book.getSheetAt(0);
		
		//Update cell data in existing row and Existing cell.
		sht.getRow(1).getCell(2).setCellValue("functional Testing");
		
		//Write data in Exising row and New Cell
		sht.getRow(3).createCell(2).setCellValue("TestPass");
		
		//Write Data in New Row and NEW cell
		sht.createRow(4).createCell(0).setCellValue("Harikiran");
		
		
		//Create New output file
		FileOutputStream fo=new FileOutputStream("TestData\\OP.xlsx");
		//Write Book data into New File
		book.write(fo);
		book.close();   //Save workbook
		
		

	}

}
