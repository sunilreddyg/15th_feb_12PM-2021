package framework.junit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Before_And_After_Method 
{

	@Before  //This annoation invoke every @Test annoation before
	public void setUp() throws Exception 
	{
		System.out.println("Method-precondition");
	}

	@After  //This annoation invoke  every @Test annotation after
	public void tearDown() throws Exception 
	{
		System.out.println("Method-postcondition"+"\n");
	}

	@Test
	public void test1() 
	{
		System.out.println("test1 method executed");
	}
	
	@Test
	public void test2() 
	{
		System.out.println("test2 method executed");
	}
	
	@Test
	public void test3() 
	{
		System.out.println("test3 method executed");
	}

}
