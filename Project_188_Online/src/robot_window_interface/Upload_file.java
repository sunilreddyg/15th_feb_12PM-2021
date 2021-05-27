package robot_window_interface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_file 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		
		WebElement upload_btn=driver.findElement(By.xpath("//label[@id='wdgt-file-upload']"));
		upload_btn.click();
		Thread.sleep(4000);
		
		String path="C:\\Users\\SUNIL\\Desktop\\Resume.docx";
		
		//Copy String
		StringSelection Spath=new StringSelection(path);
		//Enable Clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Copy content to clipboard
		clipboard.setContents(Spath, Spath);
		
		
		//Create object for robot class
		Robot robot=new Robot();
		
		//Press Control V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//Press enter
		robot.keyPress(KeyEvent.VK_ENTER);
		
	
	}

}
