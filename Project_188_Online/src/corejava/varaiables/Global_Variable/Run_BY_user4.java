package corejava.varaiables.Global_Variable;


import org.openqa.selenium.WebDriver;

public class Run_BY_user4 
{
	static WebDriver driver=null;

	public static void main(String[] args)
	{
		
		
		Reusable obj=new Reusable();
		//This method bring reusable driver class controls to current driver reference
		driver=obj.get_chrome_browser_driver();
		
		
		driver.findElement(obj.email_loc).clear();
		driver.findElement(obj.email_loc).sendKeys("mquser");

	}

}
