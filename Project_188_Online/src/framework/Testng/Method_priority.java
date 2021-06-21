package framework.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method_priority 
{
  @Test(priority=0)
  public void f() 
  {
	  Reporter.log("f method executed");
  }
  
  
  @Test(priority=1)
  public void x() 
  {
	  Reporter.log("x method executed");
  }
  
  
  @Test(priority=2)
  public void a() 
  {
	  Reporter.log("a method executed");
  }
  
}
