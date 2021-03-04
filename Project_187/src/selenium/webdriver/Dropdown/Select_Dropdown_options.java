package selenium.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown_options {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://v1.hdfcbank.com/branch-atm-locator/?lat=");
		driver.manage().window().maximize();
		
		//selecting dropdown with visible name
		new Select(driver.findElement(By.id("customState"))).selectByVisibleText("Telangana");
		Thread.sleep(4000);
		
		//selecting dropdown with visible text
		new Select(driver.findElement(By.id("customCity"))).selectByValue("khammam");
		Thread.sleep(2000);
		
		//Type text into editbox
		driver.findElement(By.id("customLocality")).clear();
		driver.findElement(By.id("customLocality")).sendKeys("Gandhi Nagar");
		Thread.sleep(2000);
		
		//Selecting dropdown  with index number
		new Select(driver.findElement(By.id("customRadius"))).selectByIndex(4);
		
		//Select Checkbox[Click method use to selected and deselect checkbox]
		driver.findElement(By.id("amenity_category_order_types49")).click();
		
		//click button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
