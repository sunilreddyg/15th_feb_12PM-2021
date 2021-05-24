package switchcommands.ActiveElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {

	public static void main(String[] args) throws Exception {
		
		

		//Step1
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	    driver.manage().window().maximize();
	    
	    
	    
	    WebElement Combobox=driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']"));
	    Combobox.click();
	    Thread.sleep(2000);
	    
	    driver.switchTo().activeElement().sendKeys("INDIA");
	    Thread.sleep(2000);
	    driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	    
	    
	    /*
	     * Sometimes selenium fail to identify ajax list due to diffent property architecture.
	     * In that case we can use activeElement method to target object which is focused
	     * at webpage.
	     */

	}

}
