package resuable.run_Excel_keywords;


import resuable.Excel_Simple_Keywords;

public class Read_Data_From_Excel {

	public static void main(String[] args) 
	{
		
			Excel_Simple_Keywords.Locate_excel_file("BOOK.xlsx");
			Excel_Simple_Keywords.TargetSheet("Info");
			
			String url=Excel_Simple_Keywords.get_String_Cell_Data(1, 0);
			System.out.println(url);
			
			String browsername=Excel_Simple_Keywords.get_String_Cell_Data(1, 1);
			System.out.println(browsername);
			
			
			
			//Target New Sheet
			Excel_Simple_Keywords.TargetSheet("Numerics");
			Double prdoct_price=Excel_Simple_Keywords.get_numeric_Data_in_double_format(1, 2);
			System.out.println(prdoct_price);
			
			
			
			//UpDate Data in Excel
			Excel_Simple_Keywords.Write_Data_At_Existing_And_NewCell(4, 2, "Testpass");
			Excel_Simple_Keywords.Create_Excel_outputfile("NewOP.xlsx");
			System.out.println("Output file was created");
	}

}
