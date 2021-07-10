package oops.Inheritance;

public class ChildA extends Parent
{

	String name="BQ"; 
	
	void method2()
	{
		System.out.println("ChildA method executed");
	}
	
	void testcase()
	{
		/*
		 * Here variable an method access without object creation.
		 *  because ChildA class extended from parent class
		 * 
		 */
		System.out.println(name);		  //It prints BQ from child class
		System.out.println(super.name);   //it prints mq from parent class
		method1();  //Calling method1 from parent class.
	}
	
	
	public static void main(String args[])
	{
		ChildA obj=new ChildA();
		obj.method1();   //Method from parent class
		obj.testcase();  //Method from ChildA class
		
		Parent obj1=new ChildA();
		System.out.println(obj1.name);
	}

}
