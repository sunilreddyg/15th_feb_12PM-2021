package ui_verifactioncommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Editbox_Input_Value {

	public static void main(String[] args) throws Exception 
	{
		
		
		/*
		 * Scenario:--> Verify Mobile operator loaded w.r.t mobile number
		 * 			Given site url is  "http://paytm.com"
		 * 			When User enter valid mobile number
		 * 			Then System fetch default operator w.r.t to mobile number
		 * 			And System fetch default location w.r.t to mobile number
		 */
		

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		
		WebElement mobile_textbox=driver.findElement(By.xpath("//input[@data-reactid='205']"));
		mobile_textbox.sendKeys("9030248855");
		Thread.sleep(5000);
		
		//Target Operator textbox and stroing into refernce name
		WebElement Operator_textbox=driver.findElement(By.xpath("//input[@data-reactid='216']"));
		//Retrieve displayed operator name at editbox 
		String OperatorName=Operator_textbox.getAttribute("value");
		
		
		if(OperatorName.equals("Airtel"))
			System.out.println("Testpass, Expected operator displayed");
		else
			System.out.println("Testfail, Wrong operator displayed");
		
		
		
		
		
		
		
		
		

	}

}
