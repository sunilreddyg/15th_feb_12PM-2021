package framework.Testng.DataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class InputData 
{
	
	@Test(dataProvider="dp")
	public void Tc001(Integer Id, String mobilename,double mobileprice) 
	{
		System.out.println(Id+"\t"+mobilename+"\t"+mobileprice);
	}
	
	  
	
	
	  @DataProvider
	  public Object[][] dp() 
	  {
	    return new Object[][] 
	    {
	      new Object[] { 100,"iphone",100000.00 },
	      new Object[] { 200,"Samsung", 90000.00},
	      new Object[] { 300,"micromax",50000.00 },
	      new Object[] { 414,"vivo",40000.00 },
	    };
	  }
	  
	  
	  
	 
	  /*
	   * Rule1:--> Should declare method with static inorder to use 
	   * 		   dataprovider data in different class..
	   */
	  @DataProvider
	  public static String[][]  userdata()
	  {
		  	String data[][]=
		  	{
		  			{"arun","art@123"},
		  			{"keerthi","ker123"},
		  			{"santhosh","san@123"},  
		  			{"prakash","prk@123"},   
		  	};
		  
		  		return data;
	  }
	  
	  
	  
	  @Test(dataProvider="userdata")
	  public void Tc002(String username,String password)
	  {
		  System.out.println(username+"\t"+password);
	  }
	  
	  

	 
  
}
