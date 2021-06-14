package pageobjects.Without_pageFactory;

import org.openqa.selenium.By;

public class FB_HOME 
{
	/*
	 * it is repository class of facebook homepage objets. In this
	 * class we are going to store all objects with in page..
	 */
	
	
	/*
	 * public:--> Modifer allow object to access across the project
	 * static:--> Specifier allow object to call across the project without object creation.
	 * 
	 * 			Classname.Variablname
	 */
	
	
	
	public static String url="https://en-gb.facebook.com/";
	
	
	public static By Signin_Email=By.xpath("//input[contains(@name,'email')]");
	public static By Singin_password=By.xpath("//input[@id='pass']");
	public static By Login_button=By.xpath("//button[@data-testid='royal_login_button']");
	public static By forgotton_password=By.xpath("//a[contains(.,'Forgotten password?')]");
	public static By Create_Account=By.xpath("//a[@role='button'][contains(@id,'zS')][contains(.,'Create New Account')]");

}
