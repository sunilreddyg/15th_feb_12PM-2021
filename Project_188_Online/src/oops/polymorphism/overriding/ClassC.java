package oops.polymorphism.overriding;

public class ClassC extends Parent
{
	
	@Override
	void run(int km)
	{
		super.run(1);
		System.out.println("ChildC class method executed --> "+km);
	}
	
	
	
	public static void main(String args[])
	{
		Parent obj=new ClassC();
		obj.run(10);
	}

}
