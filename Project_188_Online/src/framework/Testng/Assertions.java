package framework.Testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertions 

{
  @Test(priority=0)
  public void tc001()
  {
	  Assert.assertEquals("MQ","MQ");
	  Reporter.log("String comparision is matching");
	  
	  Assert.assertEquals(100, 101);
	  Reporter.log("Integer comparision is matching");
	  
	  
	  Assert.assertNotEquals(100, 101);
	  Reporter.log("Method number or not macthing");
  }
  
  @Test(priority=1)
  public void tc002()
  {
	  Reporter.log("Tc002 Executed");
	  
	  Assert.assertTrue("webdriver".contains("driver"));
	  Reporter.log("driver text available");
	  
	  
  }
  
  
  
  
}
