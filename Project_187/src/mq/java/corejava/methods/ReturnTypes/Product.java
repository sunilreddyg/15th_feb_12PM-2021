package mq.java.corejava.methods.ReturnTypes;

public class Product 
{
	//[Void metod doesn't return value]
	void info_product()
	{
		System.out.println("Apple 12, 6GB Ram, 128 GB ROM");
	}
	
	
	String get_product_price()
	{
		return "50000.00";   //Retur shoudl write before end of method
	}
	
	int Quantity()
	{
		int a=10;
		return a;
		
	}
	
	public static void main(String args[])
	{
		
		Product obj=new Product();
		obj.info_product();
		
		//Calling String retur method
		String name=obj.get_product_price();
		System.out.println(name);
		
		//Calling integer retur method
		int num=obj.Quantity();
		System.out.println(num);
		
	}
	

}
