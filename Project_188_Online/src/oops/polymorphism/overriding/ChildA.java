package oops.polymorphism.overriding;

public class ChildA extends Parent
{
	
	
	@Override
	void run(int km)
	{
		System.out.println("ChildA run method is --> "+km);
	}

	
	
	public static void main(String args[])
	{
		
	
		Parent ref=new ChildA();
		ref.run(10);
		
		
	}

}
