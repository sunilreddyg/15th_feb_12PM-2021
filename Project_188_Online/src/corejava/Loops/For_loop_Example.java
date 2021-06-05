package corejava.Loops;

public class For_loop_Example {

	public static void main(String[] args)
	{
		
		
		//printing number from 1 to 10
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(i);
		}
		
		
		System.out.println("\n");   //This command print new line in console..
		
		
		//Printing number from 10 to 1
		for (int i = 10; i > 0; i--) 
		{
			System.out.println(i);
		}
		
		
		
		//Print array values
		String mobiles[]= {"Samsung","Oppo","Iphone","BlackBerry","Vivo","Mi","Micromax"};
		int ArrayCount=mobiles.length;
		System.out.println("Array count is ---> "+ArrayCount);
		
		for (int i = 0; i < mobiles.length; i++) 
		{
			System.out.println(mobiles[i]);
		}
		
		
		
		//Conduct sum between 1 to 100 numbers
		int sum=0;
		for (int i = 1; i <= 100; i++) 
		{
			sum=sum+i;
		}
		System.out.println("total value is --> "+sum);
		
		
		
		//How to reverse a string..
		String toolname="Webdriver";
		char ch[]=toolname.toCharArray();
		
		String str="";
		
		for (int i = ch.length-1 ; i >= 0; i--) 
		{
			str=str+ch[i];
		}
		System.out.println(str);
		

	}

}
