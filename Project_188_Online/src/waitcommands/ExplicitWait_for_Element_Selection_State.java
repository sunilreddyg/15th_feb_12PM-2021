package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_for_Element_Selection_State {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://practice.automationtesting.in/my-account/");    
		driver.manage().window().maximize();
		
		
		//Enable explicit wait on automation browser
		WebDriverWait wait=new WebDriverWait(driver, 100);
		
		
		//Managing timeout until expected object radio/checkbox selection state is true
		By Checkbox_Element=By.xpath("//input[@id='rememberme']");
		wait.until(ExpectedConditions.elementToBeSelected(Checkbox_Element));
		System.out.println("Element selection status is true..");
	}

}
