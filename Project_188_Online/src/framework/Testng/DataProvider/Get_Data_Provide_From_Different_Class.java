package framework.Testng.DataProvider;

import org.testng.annotations.Test;

public class Get_Data_Provide_From_Different_Class 
{
	
	
	/*
	 * Rule:--> We should dataprovider class name inorder to use
	 * 			differnet class data provider annotation
	 */
	
	
	@Test(dataProvider="userdata",dataProviderClass=InputData.class)
	public void Tc003(String UID,String PWD)
	{
		System.out.println(UID+"\t"+PWD);
	}

}
