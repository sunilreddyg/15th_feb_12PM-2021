package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_LInks 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement Footer_Area=driver.findElement(By.xpath("//ul[@class='fs-2 flex ls-reset']"));
		List<WebElement> Footer_links=Footer_Area.findElements(By.xpath("//a[@class='fs-2 c-secondary-500 td-none hover:td-underline']"));
		System.out.println("Number of footer links available is --> "+Footer_links.size());
		

		//Applying For loop to iterate number of links
		for (int i = 0; i < Footer_links.size(); i++) 
		{
			
			WebElement Eachlink=Footer_links.get(i);
			String Linkname=Eachlink.getText();
			String LinkHref=Eachlink.getAttribute("href");
			
			System.out.println(Linkname+"   "+LinkHref);
			
			Eachlink.click();    //This action will navigate to differnt page
			Thread.sleep(2000);
			
			
			driver.navigate().back();
			Thread.sleep(2000);
			
		
			//Restore all page links to avoid stateElement reference exception..
			Footer_Area=driver.findElement(By.xpath("//ul[@class='fs-2 flex ls-reset']"));
			Footer_links=Footer_Area.findElements(By.xpath("//a[@class='fs-2 c-secondary-500 td-none hover:td-underline']"));
			
		}
		
	

	}

}
