package oops.polymorphism.overriding;

public class ClassB extends Parent
{
	
	@Override
	void run(int km)
	{
		System.out.println("ChildB run method is --> "+km);
	}
	
	public static void main(String args[])
	{
		Parent obj=new ClassB();
		obj.run(10);
	}

}
