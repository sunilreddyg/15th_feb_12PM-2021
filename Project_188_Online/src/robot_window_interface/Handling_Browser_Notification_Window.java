package robot_window_interface;


import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Browser_Notification_Window {

	public static void main(String[] args) throws Exception
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");		
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		//Create object for robot
		Robot robot=new Robot();
		
		//This method move cursor to required location with help of x and y coordinates
		robot.mouseMove(382, 165);
		Thread.sleep(2000);
		
		//This command perform left click with help of mouse
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);   //The action will be completed when release mouse only
		
		
		Thread.sleep(2000);
		robot.mouseWheel(50);   //This action will scroll down browser window.
		
		Thread.sleep(2000);
		robot.mouseWheel(-50);  //This action will scroll up browser window.

	}

}
