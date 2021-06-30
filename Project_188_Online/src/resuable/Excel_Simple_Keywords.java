package resuable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Simple_Keywords 
{
	
	static FileInputStream fi;
	static XSSFWorkbook book;
	static XSSFSheet sht;
	static String filepath="TestData\\";
	
	/*
	 * Read File :--> This method read file location
	 */
	
	public static void Locate_excel_file(String filename)
	{
		try {
			
			fi=new FileInputStream(filepath+filename);
			book=new XSSFWorkbook(fi);
			System.out.println("File is located and work is access");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	/*
	 * This Method Target Sheet
	 */
	public static void TargetSheet(String sheetname)
	{
		try {
			sht=book.getSheet(sheetname);
			System.out.println("Sheet Located");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	/*
	 * This method read String cell data from specific row and Specific cell
	 */
	public static String  get_String_Cell_Data(int rownum, int cellnum)
	{
		return sht.getRow(rownum).getCell(cellnum).getStringCellValue();
	}
	
	
	/*
	 * This method read numeric cell data from spefic row in Double format
	 */
	public static Double  get_numeric_Data_in_double_format(int rownum, int cellnum)
	{
		return sht.getRow(rownum).getCell(cellnum).getNumericCellValue();
	}
	
	
	/*
	 * This method read numeric cell data from spefic row in Double format
	 */
	public static String  get_numeric_Data_in_String_Format(int rownum, int cellnum)
	{
		Double dble=sht.getRow(rownum).getCell(cellnum).getNumericCellValue();
		return NumberToTextConverter.toText(dble);
	}
	
	
	/*
	 * This method Write Data in New Row New Cell
	 */
	public static void Write_Data_At_NewRow_And_NewCell(int Row, int Cell,String data)
	{
		sht.createRow(Row).createCell(Cell).setCellValue(data);
	}
	
	

	/*
	 * This method write data in Existing row and New cell
	 */
	public static void Write_Data_At_Existing_And_NewCell(int Row, int Cell,String data)
	{
		sht.getRow(Row).createCell(Cell).setCellValue(data);
	}
	
	
	/*
	 * this method return row count in excel sheet
	 */
	public static int Get_Row_Count()
	{
		return sht.getLastRowNum();
	}
	
	

	
	
	
	/*
	 * Create output file
	 */
	public static void Create_Excel_outputfile(String filename)
	{
		try {
			FileOutputStream fo=new FileOutputStream(filepath+filename);
			book.write(fo);
			book.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
