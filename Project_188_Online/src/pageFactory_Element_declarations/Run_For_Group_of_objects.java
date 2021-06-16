package pageFactory_Element_declarations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_For_Group_of_objects {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
		
		
		Element_Declarations ED=PageFactory.initElements(driver, Element_Declarations.class);
		
		int Group1=ED.By_Group_Objects.size();
		System.out.println("Number of objects available is ---> "+Group1);
		
		int Group2=ED.All_Group_objects.size();
		System.out.println("Number of objects available is ---> "+Group2);
		

	}

}
