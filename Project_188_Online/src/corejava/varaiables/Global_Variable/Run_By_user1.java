package corejava.varaiables.Global_Variable;

public class Run_By_user1 {

	public static void main(String[] args) 
	{
		
		
		Reusable obj=new Reusable();
		
		
		//Set driver path at runtime
		obj.driver_path="C:\\Users\\SUNIL\\Desktop\\grid\\chrome\\chromedriver.exe";
		obj.Launch_browser();
		
		//set runtime value to Url variable
		obj.url="http://facebook.com";
		obj.load_webpage();
		
		//Set username and password at runtime
		obj.usenrame_input="Darshan";
		obj.password_input="Darsh@123";
		obj.User_login();
				
		//Close browser
		obj.driver.close();
				
	}

}
