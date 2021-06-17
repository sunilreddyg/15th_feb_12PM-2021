package framework.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Before_And_After_Class 
{

	@Test
	public void test1() 
	{
		System.out.println("Test1 executed");
	}
	
	@Test
	public void test2() 
	{
		System.out.println("Test2 executed");
	}
	
	@Test
	public void test3() 
	{
		System.out.println("Test3 executed");
	}
	
	@BeforeClass  //This annotation invoke method to run before execution of first @Test
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("PreCondition Class");
	}

	@AfterClass  //Thi annotation invoke method to run after execution fo last @Test
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Post Condition class");
	}


}
