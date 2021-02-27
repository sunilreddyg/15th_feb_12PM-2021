package browser_launch;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE_Browser {

	public static void main(String[] args) 
	{
		
		/*
		 * download IEDriverServer.exe file and set up runtime
		 * environment variable..
		 * 
		 * 	1. https://www.selenium.dev/downloads/
		 *  2. Under header The Internet Explorer Driver Server
		 *  3. Make sure IEDriverserver version match with webdriver version
		 *  4. click on hotspot size link 32 or 64 bit accoriding to your system type
		 *  5. This action will download zip format file
		 *  6. move zip format file to backup folder and unzip file
		 *  7. Set rutime environment variable using IEDriverServer.exe file
		 *  
		 *  Note:-->
		 *  		IE supported browser versions
		 *  			IE8,9,10,11
		 *  	
		 *  		For IE lower version we need to change some
		 *  		privacy and security settings.
		 *  
		 *  		Change Settings:-->
		 *  				=> open IE browser
		 *  				=> Tools Menu--->internet Options
		 *  				=> Select pricay tab and uncheck all protection modes
		 *  				=> Select security tab and uncheck all protection modes
		 *  				=> make sure zoom level matches with 100%
		 */
		
		System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://google.com");
		
		System.out.println(ie.getTitle());

	}

}
