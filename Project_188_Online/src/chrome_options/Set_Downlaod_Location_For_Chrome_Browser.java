package chrome_options;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Set_Downlaod_Location_For_Chrome_Browser {

	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "D:\\screens\\");
		options.setExperimentalOption("prefs", prefs);
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.navigate().to("https://www.selenium.dev/");
		
		
		
		//Map is a collection framework it is used to store pair objects..
		Map<Integer, String> map=new HashMap<Integer,String>();
		map.put(100, "Iphone");
		map.put(200, "Samsung");
	}

}
