package oops.polymorphism.overloading;

public class OverLoading 
{


	void product(int ID)
	{
		System.out.println(ID);
	}
	
	void product(String name)
	{
		System.out.println(name);
	}
	
	void product(double price)
	{
		System.out.println(price);
	}
	
	
	void product(int ID,String name)
	{
		System.out.println(ID+"  "+name);
	}
	
	void product(String name,int ID)
	{
		System.out.println(name+"   "+ID);
	}
	
	void product(String name,double price)
	{
		System.out.println(name+"   "+price);
	}
	

	public static void main(String[] args) 
	{
	
		//Create object for overloading class
		OverLoading obj=new OverLoading();
		obj.product(10012345);
		obj.product("Iphone");
		obj.product("iphone", 1400.00);
		
		
		
			
	}

}
