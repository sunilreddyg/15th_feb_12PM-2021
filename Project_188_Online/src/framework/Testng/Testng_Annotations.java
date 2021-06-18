package framework.Testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Testng_Annotations 
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
	  
	  
	  @Test
	  public void tc003() 
	  {
		  Reporter.log("tc003 executed",true);
	  }
	
	

	  @BeforeClass //Method invoke before execution of first test
	  public void beforeClass() 
	  {
		  System.out.println("ClassPreconditon executed"+"\n");
	  }

	  @AfterClass  //Method invoke after execution fo last test
	  public void afterClass() 
	  {
		  System.out.println("ClasspostCondition executed");
	  }
	  
	  @BeforeMethod  //Invoke every test before with in class
	  public void beforemethod()
	  {
		  System.out.println("PreCondition for Method");
	  }
	  
	  
	  @AfterMethod   //invoke every test after with in class
	  public void aftermethod()
	  {
		  System.out.println("PostCondition for method"+"\n");
	  }
	  

 

}
