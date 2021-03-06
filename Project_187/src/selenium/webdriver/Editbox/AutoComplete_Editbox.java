package selenium.webdriver.Editbox;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoComplete_Editbox {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Select radio button [In Webdriver click method we use to select radio buttons]
		driver.findElement(By.id("RoundTrip")).click();

		//Selecting Suggesstion from List
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(5000);  //Timeout load sugesstion
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		Thread.sleep(5000);
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		Thread.sleep(3000);//Timeout to prompt Departure date calendar
		driver.findElement(By.linkText("21")).click();
		
		//Type text into ReturnDate Editbox [This action only possible wehen Edibtox is writable mode]
		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("Tue, 17 Aug, 2021",Keys.ESCAPE);
		
		
		//Select dropdown option
		new Select(driver.findElement(By.id("Adults"))).selectByVisibleText("5");
		
		//Verify childrens dropdown option count displayed  according to adults dropdown selection count
		Select Childrens_Selector=new Select(driver.findElement(By.id("Childrens")));
		int Count=Childrens_Selector.getOptions().size();
		if(Count==5)
			System.out.println("Testpass,Children dropdown showing option according to adults selection");
		else
			System.out.println("Testfail,Childrens dropdown showing more options than expected");
		
		
		driver.findElement(By.partialLinkText("More options:")).click();
		
		//click on Search button
		driver.findElement(By.id("SearchBtn")).click();
	}

}
