package corejava.varaiables;

public class String_Comparision_Commands 
{
	
	public static void main(String args[])
	{
		
		
		/*
		 * String:-->
		 * 			=> String is non-primitive datatype.
		 * 			=> String store set of charactes
		 * 			=> String is not only datatype and String also
		 * 				called as class.
		 * 			=> String contains set of events[Methods] to validate
		 * 				stored characters.
		 */
		
		
		
		
		
		/*
		 * Equals:-->
		 * 		Equal is a method under string class it verify any two
		 * 		strings matching and return boolean value true/false.
		 * 
		 * 		Note:--> Equal method verify comparision is case-sensitive
		 * 		
		 */
		String exp_res="account created";
		String act_res="Account created";
		boolean flag=exp_res.equals(act_res);
		System.out.println("Equal comparison is ---> "+flag);
		
		
		
		/*
		 * EqualIgnorecase:-->
		 * 			EqualIgnorecase is a method under string class, It verify
		 * 			any two strings equal comparision by ignoring case-sensitive.
		 * 			return value boolean
		 */
		boolean flag1=exp_res.equalsIgnoreCase(act_res);
		System.out.println("Equal ignore case comparision is --> "+flag1);
		
		
		
		/*
		 * Contains:-->
		 * 		  	Method verify partial characters available at main string.
		 * 			and return boolean value true/false.
		 */
		String Status="Account 100 created successfull";
		boolean flag2=Status.contains("created");
		boolean flag3=Status.contains("cred");
		System.out.println("Characters available --> "+flag2);
		System.out.println("Characters available -->"+flag3);
		
		
		/*
		 * SubString:-->
		 * 			Method get substring characters from mainString
		 */
		String Record_status="user 100 posted";
		String sub=Record_status.substring(5, 8);
		System.out.println("Sub characters are --> "+sub);
		
		
		String Account_num="1000242424";
		String Last_6_digit_accountNum=Account_num.substring(4);
		System.out.println("last 6 digit accont number is ---> "+Last_6_digit_accountNum);
		
		
		
		/*
		 * length:-->
		 * 		Method return number of characters available at string
		 */
		 String Mobile_num="9030248855";
		 int length=Mobile_num.length();
		 System.out.println("mobile number length is --> "+length);
		
		 //Conditional statement ot accept on valid mobile number
		 if(length==10)
		 {
			 System.out.println("Mobile number is valid");
		 }
		 else
		 {
			 System.out.println("Mobile number is invalid");
		 }
		
		
		
		/*
		 * Startswith:-->
		 * 			Method verify given string starts with required characters
		 * 			are not. And it is boolean return type method
		 */
		String IFSC="HDFC0000123";
		boolean flag4=IFSC.startsWith("HDFC");
		System.out.println("String Starts with HDFC --> "+flag4);
		
		
		/*
		 * EndsWith:-->
		 * 			Method verify given string end with required characters
		 * 			are not. And return boolean value true/false
		 */
		String PinCode="500034";
		boolean flag5=PinCode.endsWith("34");
		System.out.println("String ends with 34 --> "+flag5);
		
		
		
		/*
		 * ToUppercase:-->
		 * 		  Method convert all lowercase characters into uppercase
		 */
		String passcode="bAnkjd";
		System.out.println(passcode.toUpperCase());
		
		
		/*
		 * Tolowercase:-->
		 * 		Method convert all uppercase characters into lowercase
		 */
		String Statecode="TbcnAbDf";
		System.out.println(Statecode.toLowerCase());
		
		
		
		/*
		 * isEmpty:-->
		 * 		Method verify characters empty status at string and returnb
		 * 		boolean value ture/false
		 */
		String var1="";
		String var2="Hello";
		System.out.println("var1 Empty status is ---> "+var1.isEmpty());
		System.out.println("var2 Empty status is ---> "+var2.isEmpty());
		
		
		
		/*
		 * concat:-->
		 * 		Method usefull to club tow strings
		 */
		String str1="Hello";
		String str2="there";
		System.out.println(str1.concat(" ").concat(str2));
		System.out.println(str1+" "+str2);
		
		
		
	}

}
