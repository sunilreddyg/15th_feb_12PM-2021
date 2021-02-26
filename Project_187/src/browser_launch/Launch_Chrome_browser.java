package browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_browser 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\browser_drivers\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://spicejet.com");
		System.out.println(chrome.getTitle());
		chrome.close();
		
		
		
		

	}

}
