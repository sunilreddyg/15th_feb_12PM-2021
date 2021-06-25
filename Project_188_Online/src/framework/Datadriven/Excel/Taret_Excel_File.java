package framework.Datadriven.Excel;

import java.io.FileInputStream;


public class Taret_Excel_File {

	public static void main(String[] args) throws Exception 
	{
		
		
		//Target Binary file location
		FileInputStream fi=new FileInputStream("TestData\\InputBook.xlsx");
		System.out.println("file located");
		
		
		
		
		//Target binary file location along with try catch block
		try {
			
			FileInputStream inputfile=new FileInputStream("TestData\\BOO.xlsx");
			System.out.println("file located");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
