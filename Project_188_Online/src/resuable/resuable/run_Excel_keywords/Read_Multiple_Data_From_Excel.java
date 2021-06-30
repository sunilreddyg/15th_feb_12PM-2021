package resuable.resuable.run_Excel_keywords;

import org.testng.annotations.Test;

import resuable.Excel_Simple_Keywords;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Read_Multiple_Data_From_Excel 
{
	String filename="BOOK.xlsx";
	String Sheetname="multiple";
	
  @Test
  public void f()
  {
	  int RowNum=Excel_Simple_Keywords.Get_Row_Count();
	  for (int i = 1; i <= RowNum; i++) 
	  {
		 String username=Excel_Simple_Keywords.get_String_Cell_Data(i, 0);
		 System.out.println(username);
	  }
	  
	  
  }
  @BeforeClass
  public void beforeClass() 
  {
	  Excel_Simple_Keywords.Locate_excel_file(filename);
	  Excel_Simple_Keywords.TargetSheet(Sheetname);
  }

  @AfterClass
  public void afterClass() 
  {
	  Excel_Simple_Keywords.Create_Excel_outputfile("OP123.xlsx");
  }

}
