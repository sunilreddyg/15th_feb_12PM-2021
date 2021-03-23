package ui_verificationCommands.getCssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Element_Styles {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement Roundtrip_Label=driver.findElement(By.xpath("//label[.='Round Trip']"));
		Roundtrip_Label.click(); //Selecting radio button using label
		Thread.sleep(3000);
		
		
		//Retrieve label color
		String Ele_color=Roundtrip_Label.getCssValue("color");
		System.out.println("Element Color is ---> "+Ele_color);
		
		//Verify Expected color presented at label
		if(Ele_color.equals("rgba(255, 0, 0, 1)"))
			System.out.println("Expected color presented");
		else
			System.out.println("Wrong color presented");
		
		
		//Print Text alignment
		System.out.println(Roundtrip_Label.getCssValue("text-align"));
		//Print text size
		System.out.println(Roundtrip_Label.getCssValue("font-size"));

	}

}
