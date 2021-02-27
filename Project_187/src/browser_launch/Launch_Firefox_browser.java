package browser_launch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_browser {

	public static void main(String[] args) 
	{
		
		/*
		 * downlaod geckodrier.exe file and setup  runtime environment
		 * variable
		 * 
		 * 	1. Enter site url  https://firefox-source-docs.mozilla.org/testing/geckodriver/Support.html
		 *  2. Choose geckodriver version according selenium and firefox brwoser version
		 *  3. click on geckodriver releases link
		 *  4. Under asset choose operating system and hotspot size
		 *  5. downlaod zip format file for windows
		 *  6. move file to backup folder and unzip file
		 *  7.This action create one geckodriver.exe file
		 *  8.Use file location to set up environment variable
		 */
		
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://facebook.com");
		
		System.out.println(firefox.getTitle());

	}

}
