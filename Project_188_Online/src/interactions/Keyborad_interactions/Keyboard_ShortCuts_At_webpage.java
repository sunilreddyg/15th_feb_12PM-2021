package interactions.Keyborad_interactions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_ShortCuts_At_webpage {

	public static void main(String[] args)
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
	

	}

}
