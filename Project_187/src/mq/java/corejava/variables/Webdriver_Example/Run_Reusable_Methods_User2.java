package mq.java.corejava.variables.Webdriver_Example;

import org.openqa.selenium.WebDriver;

public class Run_Reusable_Methods_User2 {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//Create object for Reusable methods
		Reusable_Methods obj=new Reusable_Methods();
		obj.Browser_name="firefox";
		obj.Driver_path="Drivers\\";
		obj.Launch_Browser();
		
		obj.url="http://facebook.com";
		obj.Get_App();
		
		obj.username="Harish";
		obj.password="hello";
		obj.User_login();
		
		
		
		
		Thread.sleep(4000);
		driver=obj.driver;
		driver.close();

	}

}
