package pageFactory_Element_declarations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_PageFactory_Elements 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
		
		/*
		 * Inorder to get access @findby method we should take help of
		 * page factory class
		 */
		
		Element_Declarations ED=PageFactory.initElements(driver, Element_Declarations.class);
		ED.Firstname_EB.sendKeys("Newuser");
		
		//Print all page links count
		System.out.println("lind count at webpage--> "+ED.page_links.size());
		
		//Get dropdown count at page
		System.out.println("dropdowns count is --> "+ED.Dropdown.size());
		
		//Select Fifth option under dropdown
		boolean flag=ED.Dropdown.get(0).getText().contains("31");
		System.out.println(flag);
		
		//Select Dec month 
		ED.Month_options.get(5).click();
		Thread.sleep(3000);
		
		//Select March month with resuable method
		ED.select_month("Mar");
		
		//Select Year with resuable method
		ED.Select_month(ED.year_options, "1996");
		
		

	}

}
