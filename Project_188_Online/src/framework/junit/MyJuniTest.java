package framework.junit;


import org.junit.Test;

public class MyJuniTest 
{

	@Test //Here @Test annotation organize method to run without object creation
	public void test1() 
	{
		System.out.println("test1 executed");
	}
	
	
	@Test //Here @Test annotation organize method to run without object creation
	public void test2() throws Exception 
	{
		throw new Exception("invalid selector exception");
	}
	
	@Test //Here @Test annotation organize method to run without object creation
	public void test3() 
	{
		System.out.println("test3 executed");
	}

}
