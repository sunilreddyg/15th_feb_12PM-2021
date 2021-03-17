package mq.java.corejava.variables.Webdriver_Example;

import org.openqa.selenium.WebDriver;

public class Run_Reusable_Methods_user1 
{
	static WebDriver driver;

	public static void main(String[] args) throws Exception 
	{
		
		//Create object for Reusable methods
		Reusable_Methods obj=new Reusable_Methods();
		obj.Browser_name="chrome";
		obj.Driver_path="Drivers\\";
		obj.Launch_Browser();
		
		obj.url="http://facebook.com";
		obj.Get_App();
		
		obj.username="Darshan";
		obj.password="hello";
		obj.User_login();
		
		
		Thread.sleep(2000);
		driver=obj.driver;
		boolean flag=driver.findElement(Reusable_Objects.Login_Email).isDisplayed();
		System.out.println("Object visible status is ---> "+flag);
		Thread.sleep(4000);
		driver.close();
		

	}

}
