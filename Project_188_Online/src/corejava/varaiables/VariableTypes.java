package corejava.varaiables;

public class VariableTypes 
{
	
	String toolname="webdriver";    //Global variable [Because these variabel define outside method inside a class]
	double toolcost=12000.00;       //Global variable
	
	public void method1()
	{
		String name="MQ";   //This is local variable we can't access outside a class
		System.out.println("local variable name is --> "+name);
		System.out.println("global variable name is --> "+toolname);
	}
	
	public void method2()
	{
		System.out.println("global variable -> "+toolname);
	}
	
	
	

	public static void main(String[] args) 
	{
		/*
		 * By creation of object we can access global variable outside a class.
		 * 		Classname obj=new Classname();
		 * 		obj.methodname();
		 * 		obj.varaiblename;       Note:--> Varaible must return value.
		 */
		
		VariableTypes obj=new VariableTypes();
		String tname=obj.toolname;
		double tcost=obj.toolcost;
		System.out.println(tname+"   "+tcost);
	}

	
	
}
