package framework.Testng.BeforeTest_and_AfterTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSuite1 
{
	
  @BeforeClass  //invoke before first @Test with in class
  public void beforeclass()
  {
	  System.out.println("Suite before classes executed");
  }
	
	
  @Test
  public void tc001() 
  {
	  System.out.println("tc001 executed");
  }
  
  @Test
  public void tc002() 
  {
	  System.out.println("tc002 executed");
  }
  
  
  @Test
  public void tc003() 
  {
	  System.out.println("tc003 executed");
  }
  
  @AfterSuite		//In invoke at final of suite execution
  public void aftersuite()
  {
	  System.out.println("Suite End work complete");
  }
  
 

  
}
