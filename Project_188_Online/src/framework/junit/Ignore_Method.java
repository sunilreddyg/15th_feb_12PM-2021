package framework.junit;


import org.junit.Ignore;
import org.junit.Test;

public class Ignore_Method {

	@Test
	public void test1() 
	{
		System.out.println("test1 method executed");
	}
	
	@Ignore
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
