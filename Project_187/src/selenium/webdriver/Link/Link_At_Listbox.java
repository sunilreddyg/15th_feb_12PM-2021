package selenium.webdriver.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_At_Listbox {

	public static void main(String[] args) throws Exception 
	{
		

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://hdfcbank.com");
	    driver.manage().window().maximize();
	    Thread.sleep(10000);
	    
	    driver.findElement(By.linkText("Select Product Type")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[@value='4'][contains(.,'Loans')]")).click();
	    Thread.sleep(4000);
	    
	    driver.findElement(By.linkText("Select Product")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[@value='3'][contains(.,'Lifestyle')]")).click();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
