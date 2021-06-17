package framework.junit;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_All_Annotations {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Class PreCondition"+"\n");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Class postCondition");
	}

	@Before
	public void setUp() throws Exception 
	{
		System.out.println("Test precondition");
	}

	@After
	public void tearDown() throws Exception 
	{
		System.out.println("Test PostCondition"+"\n");
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
}
