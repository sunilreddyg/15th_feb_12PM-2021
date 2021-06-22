package framework.Testng.BeforeTest_and_AfterTest;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test_For_Firefox
{
	
		@BeforeTest
		public void beforetest()
		{
			System.out.println("precondition before launch firefox");
		}
	

	    @AfterTest
	    public void afterTest() 
	    {
	    	System.out.println("posttest after firefox launch ");
	    }
	    
	    
	    @Test
	    public void firefox_test()
	    {
	    	System.out.println("firefox test finished");
	    }
	  
	  
}
