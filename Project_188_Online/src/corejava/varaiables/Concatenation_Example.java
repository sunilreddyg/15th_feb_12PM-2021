package corejava.varaiables;

public class Concatenation_Example 
{

	public static void main(String[] args) 
	{
		
		
		int a=100;
		int b=200;
		
		int c=a+b;   //here + operate conduct addition between two strings
		System.out.println("total value is --> "+c);
		
		String name="iphone";
		String des="smartphone";
		
		System.out.println(a+b);    			//addition
		System.out.println(a+b+name+des);
		System.out.println(name+des+a+b);
		System.out.println(name+des+(a+b));   
		
		/*
		 * Using + operator we can directly club two strings
		 */
		
		String x="Hi";
		String y="Hello";
		String z=x+y;    // Here + operator concatenated two strings
		System.out.println(z);
		String m=x.concat(y);
		
 
	}

}
