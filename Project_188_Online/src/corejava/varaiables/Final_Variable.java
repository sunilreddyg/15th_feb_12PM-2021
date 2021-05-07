package corejava.varaiables;

public class Final_Variable 
{
	
	
	String prodcutname="iphone";      //Prodcutname can be override becase it is not final variable
	final double prodcutPrice=15000.00;
	final int a=200;		//It remains 200 always
	
	public static void main(String[] args) 
	{
		
			//Object Creation
			Final_Variable obj=new Final_Variable();
			//Get Global variable and assinge new value at runtime.
			obj.prodcutname="Samsung";
			System.out.println(obj.prodcutname);
			
			System.out.println(obj.prodcutPrice);
			
	}

}
