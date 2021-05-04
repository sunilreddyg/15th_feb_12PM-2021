package corejava.varaiables;

public class Variable_Static_Specifier 
{
	
	static int x=100;
	static int y=300;
	
	
	public void method1()
	{
		System.out.println(x);
	}
	
	
	

	public static void main(String[] args) 
	{
		
		/*
		 * Inorder to call static variables outside class no need of object creation
		 * 		ClassName.VariableName;
		 * 
		 * 		Note:--> Variable always retur value..
		 */
		int a=Variable_Static_Specifier.x;
		int b=Variable_Static_Specifier.y;

	}

}
