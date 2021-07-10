package oops.Inheritance;

public class ChildB extends ChildA
{
	
	void testcase()
	{
		System.out.println(name);
		method2();
	}
	
	public static void main(String args[])
	{
		
		ChildB obj=new ChildB();
		obj.method1();   //From parent class
		obj.method2();   //From child class classA
		obj.testcase();  //From child class ClassB
		
		
		
		
		//Create object with parent class
		Parent obj1=new ChildB();
		System.out.println(obj1.name);
		
		
	}
	
	

}
