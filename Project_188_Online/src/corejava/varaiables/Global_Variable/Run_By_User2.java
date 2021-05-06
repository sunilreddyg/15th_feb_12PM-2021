package corejava.varaiables.Global_Variable;

public class Run_By_User2 {

	public static void main(String[] args) 
	{
		
		Reusable obj=new Reusable();
		
		//Set driver path at runtime
		obj.driver_path="drivers\\chromedriver.exe";
		obj.Launch_browser();
		
		//set runtime value to Url variable
		obj.url="http://facebook.com";
		obj.load_webpage();
		
		//Set username and password at runtime
		obj.usenrame_input="bridgeqsystems";
		obj.password_input="brq@123";
		obj.User_login();
		
		//Close browser
		obj.driver.close();

	}

}
