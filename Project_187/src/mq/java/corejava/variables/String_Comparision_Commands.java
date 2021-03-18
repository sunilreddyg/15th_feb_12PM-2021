package mq.java.corejava.variables;

public class String_Comparision_Commands 
{

	public static void main(String[] args) 
	{

		/*
		 * String:-->
		 * 			=> string store set of characters
		 * 			=> String is not only a datatype also called as class
		 * 			=> String class contains set of events to validate stored characters
		 */
		
		String Exp_res="Account created Successfull";
		String Act_res="account created successfull";
		
		/*
		 * Equals:-->
		 * 		Method verify equal comaprision between two string and return
		 * 		value true/false. Equals is case-sensitive
		 */
		boolean flag=Act_res.equals(Exp_res);
		System.out.println("Equal Comparision status is --> "+flag);
	
		
		/*
		 * EqualIngoreCase:-->
		 * 		Method verify Equal comparision between two strings by ignoring
		 * 		case sensitive. finally return value true/false
		 */
		boolean flag1=Exp_res.equalsIgnoreCase(Act_res);
		System.out.println("EqualIgnore case comparision is ---> "+flag1);

	
		/*
		 * contains:-->
		 * 		Method verify substring avaialble at mainstring and return
		 * 		boolean value true/false
		 */
		String Status="Account Posted";
		boolean flag3=Status.contains("Posted");
		System.out.println("Sub strign available status is ---> "+flag3);
		
		
		/*
		 * subString:-->
		 * 			Method get substring characters from main string
		 */
		String Account_num="0023548512457";
		String Last_Digits=Account_num.substring(6);
		System.out.println("Lastt 6 digits numbers are ---> "+Last_Digits);
		
		String Middle_digits=Account_num.substring(2, 6);
		System.out.println("Middle digit characters are ---> "+Middle_digits);
		
		
		/*
		 * Length:-->
		 * 		 	Method return number of characters available at srtring
		 * 			and return value in integer format
		 */
		String Mobile_Num="9030248855";
		int len=Mobile_Num.length();
		System.out.println("Mobile number size in characters --> "+len);
		
		
		/*
		 * Trim:-->
		 * 			Method trim extra spaces with in string. It only
		 * 			manage left and right spaces.
		 */
		String Zipcode="    500036     ";
		System.out.println("Before Trim Zipcode is ---> "+Zipcode.length());
		String New_zipcode=Zipcode.trim();
		System.out.println("After trim zipcode is -----> "+New_zipcode.length());
		
		
		/*
		 * StartsWith:-->
		 * 			Method verify required string starts with Expected Characters
		 * 			and return boolean value true/false
		 */
		String IFSC_code="HDFC00001234";
		boolean flag4=IFSC_code.startsWith("HDFC");
		System.out.println("Character stats with  status is ---> "+flag4);
		
		/*
		 * Endswith:-->
		 * 		Method verify required strign ends with expected characters 
		 * 		and return boolean value true/false
		 */
		boolean flag5=IFSC_code.endsWith("1234");
		System.out.println("characters ends with status is ---> "+flag5);
		
		
		/*
		 * ToUpperCase:-->
		 * 		Metod convert all available lowercase characters into Uppercase
		 * 		characters
		 */
		String Toolname="WebDriver";
		String UToolname=Toolname.toUpperCase();
		System.out.println("Toolname in uppercase characters ---> "+UToolname);
		
		
		/*
		 * ToLowerCase:-->
		 * 		method convert all available uppercase characters into lowercase
		 * 		characters.
		 */
		String Ltoolname=Toolname.toLowerCase();
		System.out.println("Toolname in lowercase characters ---> "+Ltoolname);
		
		
		/*
		 * isEmpty:-->
		 * 		method return boolean status true of false based on characters
		 * 		available at string
		 */
		String var1="Hello";
		String var2="";
		System.out.println("Var1 Empty status is ---> "+var1.isEmpty());
		System.out.println("Var2 Empty status is ---> "+var2.isEmpty());
		
		
		/*
		 * concat:-->
		 * 		Method clug two strings into single string
		 */
		String conct="Hi".concat("Hello");
		System.out.println(conct);
		
		
		//Replace old character with new character.
		String Rvalue="Hello".replace("o", "i");
		System.out.println(Rvalue);
		
		
	
		
		
	}

}
