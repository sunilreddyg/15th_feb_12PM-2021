package resuable;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reusable_keywords
{
	FileInputStream fi;
	XSSFWorkbook book;
	XSSFSheet sht;
	XSSFRow row;
	XSSFCell cell;
	String filepath="TestData\\";
	String filename;
	String SheetName;
	/*
	 * ReadFile:-->
	 */
	public FileInputStream ReadFile(String filename,String Sheetname)
	{
		try {
			
		    fi=new FileInputStream(filepath+filename);
			this.filename=filename;
			this.SheetName=Sheetname;
		} catch (Exception e) {
			
		}
		return fi;
	}
	
	/*
	 * GetWorkbook:--->
	 */
	public XSSFWorkbook GetBook()
	{
		try {
			book=new XSSFWorkbook(ReadFile(filename, SheetName));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return book;
	}
	
	
	/*
	 * GetWorkbook:--->
	 */
	public XSSFSheet GetSheet()
	{
		try {
			sht=GetBook().getSheet(SheetName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return sht;
	}
	
	
	/*
	 * GetCellData:--->
	 */
	public Object getCellData(int Row,int cellnum)
	{
		cell=GetSheet().getRow(Row).getCell(cellnum);
		Object CellData = null;
		if(cell.getCellType()==CellType.STRING)
		{
			CellData=cell.getStringCellValue();
		}
		else if(cell.getCellType()==CellType.NUMERIC)
		{
			CellData=cell.getNumericCellValue();
		}
		else if(cell.getCellType()==CellType.BOOLEAN)
		{
			CellData=cell.getBooleanCellValue();
		}
		
		return CellData;
	}
	
	
	/*
	 * GetString CellData:--->
	 */
	public String getStringCelldata(int row, int cell)
	{
		
		Object objcell=getCellData(row,cell);
		return objcell.toString();
		
	}
	
	/*
	 * Get numeric CellData:--->
	 */
	public Integer getNumric_Celldata(int row, int cell)
	{
		
		Object objcell=getCellData(row,cell);
		Double dvalue=new Double((double) objcell);
		return dvalue.intValue();
	}
	
	/*
	 * Get numeric CellData:--->
	 */
	public String Read_NumericCell_In_String_format(int row, int cell)
	{
		
		Object objcell=getCellData(row,cell);
		
		return  NumberToTextConverter.toText((Double)objcell);
		
	}
	
	/*
	 * Get numeric CellData:--->
	 */
	public Double Read_Double_CellData(int row, int cell)
	{
		
		Object objcell=getCellData(row, cell);
		Double d=new Double(objcell.toString());
		return d;
		
	}
	
	
	
}
