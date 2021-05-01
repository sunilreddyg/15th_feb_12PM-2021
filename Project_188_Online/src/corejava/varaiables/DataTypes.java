package corejava.varaiables;

public class DataTypes {

	public static void main(String[] args) 
	{
		
		
		/*
		 * byte:-->
		 * 		=> byte is a numeric datatype
		 * 		=> byte has memory min -128  and max 127
		 */
		byte a=127;
		System.out.println(a);
		
		
		/*
		 * short:-->
		 * 		=>  short is a numerix datatype
		 * 		=>  short has memory min -32,768  and  max 32,767
		 * 		
		 */
		short b=32767;
		System.out.println(b);
		
		
		/*
		 * int:--> 
		 * 		=> int is a numeric datatype
		 * 		=> in has memory min -2,147,483,648 to 2,147,483, 647
		 * 
		 * 		Note:--> Alwasy use int to store numeric values because byte,shot
		 * 				values also refer int type only..
		 */
		 int c=2147483647;
		 System.out.println(c);
		 
		 
		 
		/*
		 * long:-->
		 * 		=> Long is a numeric datatype
		 * 		=> long has memory -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		 * 		=> we can't assing long value directly
		 */
		 long d=System.currentTimeMillis();
		 System.out.println(d);
		 
		 
		 
		 /*
		  * float:-->
		  * 	=> float is decimal value
		  * 	=> float value should end with f character
		  * 	=> default value is 0
		  */
		 float e=1234.1f;
		 System.out.println(e);
		 
		 
		 /*
		  * double:-->
		  * 	=> double store decimal values
		  * 	=> default value is 0
		  */
		 double f=1200.20;
		 System.out.println(f);
		 
		 
		 /*
		  * boolean:-->
		  * 	=> boolean store only memory true/false
		  * 	=> default value is false;
		  */
		boolean g=true;
		boolean h=false;
		System.out.println(g);
		System.out.println(h);
		
		
		/*
		 * char:-->
		 * 		=> char store only single characters
		 * 		=> to define single charaters we should define single quotes
		 */
		char i='A';
		System.out.println(i);
		
		
		/*
		 * String:-->
		 * 		=> String is a non-primitive datatype
		 * 		=> String store set of charaters
		 * 		=> with is string we define set of characters in double quotes
		 * 		=> String is not only dattype it is also a CLASS
		 * 		=> String start with uppercase
		 */
		String name="bridgeqsystems";
		String email="info.bridgeqsystems@gmail.com";
		String mobile="9030248855";
		String Address="#208, SreeManRama Towers";
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(mobile);
		System.out.println(Address);
		

	}

}
