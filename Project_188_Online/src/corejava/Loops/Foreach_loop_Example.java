package corejava.Loops;

public class Foreach_loop_Example 
{

	public static void main(String[] args) 
	{
		
		
		
		String mobiles[]= {"Samsung","Oppo","Iphone","BlackBerry","Vivo","Mi","Micromax"};
		for (String eachmobile : mobiles) 
		{
			System.out.println(eachmobile);
		}
		
		
		int num[]= {100,200,300,400,500};
		for (int i : num) 
		{
			System.out.println(i);
		}
		

		/*	
		 * How to debug your program..
		 * 	1. Insert break point   [Select a line and double click on blue color border line]
		 *  2. Right click on Script --> Select Debug As ---> Select Java application
		 *  3. It open debug prospective window [Watch variable window]
		 *  4. Press F6 to run each step
		 *  5. Press F8 to resume in regular mode
		 *  
		 */

	}

}
