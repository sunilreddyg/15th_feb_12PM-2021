package corejava.varaiables.Global_Variable;

import org.openqa.selenium.WebDriver;

public class Run_By_user3 
{
	
	static WebDriver driver=null;

	public static void main(String[] args) throws Exception 
	{
		
		Reusable obj=new Reusable();
		driver=obj.get_chrome_browser_driver();  //This methdo bring driver controls from other class to current class
	
		
		obj.usenrame_input="Harinath";
		obj.password_input="Hari$12345";
		obj.User_login();
		Thread.sleep(10000);
		
		
		driver.findElement(obj.email_loc).clear();
		driver.findElement(obj.email_loc).sendKeys("Sunil");
		
		
		
		driver.close();

	}

}
