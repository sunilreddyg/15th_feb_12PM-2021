package framework.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class My_TestngTest 
{
	
  @Test  //Invoke method to run 
  public void tc001()
  {
	  Reporter.log("tc001 executed successfull");     //This option don't have in junit
  }
  
  
  @Test  //Invoke method to run 
  public void tc002()
  {
	  Reporter.log("tc002 executed successfull");     //This option don't have in junit
  }
  
  
  
  @Test  //Invoke method to run 
  public void tc003()
  {
	  Reporter.log("tc003 executed successfull",true);     //This option don't have in junit
  }
  
  
  
}
