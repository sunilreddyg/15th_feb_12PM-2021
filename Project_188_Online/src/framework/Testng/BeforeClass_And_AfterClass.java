package framework.Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeClass_And_AfterClass 
{
  @Test
  public void tc001() 
  {
	  Reporter.log("tc001 executed",true);
  }
  
  
  @Test
  public void tc002() 
  {
	  Reporter.log("tc002 executed",true);
  }
  
  
  
  
  @BeforeClass //Method invoke before execution of first test
  public void beforeClass() 
  {
	  System.out.println("Preconditon executed");
  }

  @AfterClass  //Method invoke after execution fo last test
  public void afterClass() 
  {
	  System.out.println("post condition executed");
  }

}
