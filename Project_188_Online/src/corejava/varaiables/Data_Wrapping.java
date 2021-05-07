package corejava.varaiables;

public class Data_Wrapping {

	public static void main(String[] args) 
	{
		
		/*
		 * primitive Type     --->       Wrapper Class
		 * 
		 * boolean						 Boolean
		 * char							 Characters
		 * byte							 Byte
		 * short 						 Short
		 * long							 Long
		 * float						 Float
		 * int							 Integer
		 * double						 Double
		 * 
		 */
		
		
		/*
		 * Auto-boxing:-->
		 * 		Changing primitive datatype into Class using Wrapper Class
		 */
		
		int a=100;
		Integer b=Integer.valueOf(a);
		//converting integer value to double value
		System.out.println("Integer to double => "+b.doubleValue());
		
		
		/*
		 * Unboxing:-->
		 * 		Changing Class Values into primitive values.
		 */
		Integer c=120;
		int d=c.intValue();   //Now integer value convert into primitive datatype..
		
		
		
		/*
		 * autobox double value to non primitive
		 */
		Double dbl=new Double(123.12);
		System.out.println("Coverting double value into integer format --> "+dbl.intValue());

	}

}
