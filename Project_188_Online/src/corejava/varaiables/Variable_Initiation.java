package corejava.varaiables;

public class Variable_Initiation 
{

	public static void main(String[] args) 
	{
		
		
		int a=100;   //100 value assigned to a variable
		a=200;       //200 value override 100 value
		System.out.println(a);  //It prints 200..
		
		
		//Group initiation  
		int x,y,z;
		x=10;
		y=20;
		z=30;
		
		
		/*
		 * 	It is initiated inside condition. SO that
		 * 	we can't use outside condition
		 * 
		 */
		if(true)
		{
			String name="WebDriver";     
			System.out.println(name);  //print accept only inside a condition
		}
		
		
		
		/*
		 * 	It is initiated outside condition and assigned
		 * 	value iniside a condition.
		 * 
		 * Note:--> 
		 * 
		 */
		
		String toolname;
		if(true)
		{
			toolname="WebDriver";
		
		}
		System.out.println(toolname);  //Printing toolname outside a condition
		
		
		
		boolean flag = false;
		int Age=19;
		if(Age >= 18)      // > is a math operator it return boolean value
		{
			flag=true;
			System.out.println(flag);  //It prints true
		}
		else
		{
			System.out.println(flag);  //It print false because value was initlized outside condition.
		}
		
		System.out.println(flag);  //It prints true of false according condition
		
		
		
		
		
		//Variabel initiation at loop
		
		int total = 0;
		for (int i = 1; i <= 10; i++) 
		{
			//Conduct sum between 1 to 10 and print total outside condition.
			total=total+i;
		}
		System.out.println(total);
		
		

	}

}
