package ui_verifactioncommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		WebElement Roundtrip_label=driver.findElement(By.xpath("//label[contains(.,'Round Trip')]"));
		Roundtrip_label.click();   //Selecting roundtrip radio button with lable.
		Thread.sleep(2000);
		
		
		//Vefify roundtirp button label text changed to red color..
		
		//Get Color of object using CssSelector
		String Obj_color=Roundtrip_label.getCssValue("color");
		if(Obj_color.equals("rgba(255, 0, 0, 1)"))
			System.out.println("Tetpass, Color chanaged to red");
		else
			System.out.println("Testfail, Color mismatched. Displayed color is --> "+Obj_color);
		
		
		

	}

}
