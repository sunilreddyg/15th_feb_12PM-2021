package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_browser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Download chromedriver.exe executable file and create
		 * environment variable...
		 * 
		 * 	1. Open site with https://www.selenium.dev/downloads/
		 *  2. Click on +Browser menu[This action open list of browser drivers ]
		 *  3. Choose Chrome browser click on documentation
		 *  4. Find Chrome Browser version [Settings--->Help---> About chrome]
		 *  5. Downlaod chromedriver w.r.t chrome browser version
		 *  			chromebrowser version 88  ---> Driver should be 88
		 *  6. After selection it navigate to index page
		 *  7. Select operating system and hotspot size then downlaod zipformat file
		 *  8. Move zipformat file to backup folder and unzip file
		 *  9. For this action we receive chromedriver.exe file
		 *  10. Create Runtime Environment variable for chromedriver.exe file
		 * 
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("https://facebook.com");
		
		System.out.println(chrome.getTitle());
		
		
	}

}
