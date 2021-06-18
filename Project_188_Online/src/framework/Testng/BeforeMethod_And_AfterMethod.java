package framework.Testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethod_And_AfterMethod 
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
	  
	  
	  @BeforeMethod  //Invoke every test before with in class
	  public void beforemethod()
	  {
		  System.out.println("PreCondition for Method");
	  }
	  
	  
	  @AfterMethod   //invoke every test after with in class
	  public void aftermethod()
	  {
		  System.out.println("PostCondition for method");
	  }
	  


}
