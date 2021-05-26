package robot_window_interface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Copy_Paste_String_With_Robot_Interface 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Open notepad file at runtime suing java program
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		
		String text="Download the Naukri app for free & browse from a variety of jobs based on your preferences";

		
		//Below lines of code copy required string to clipboard.
		//Select String
		StringSelection Stext=new StringSelection(text);
		//Enable System clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set Input to Clipbaord
		clipboard.setContents(Stext, Stext);
		
		
	
		Robot robot=new Robot();
		robot.setAutoDelay(200);
		
		//Press contrl+v shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Because controls is down keys mandatory to release after pressing.
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		//Press Control+S keyboard shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		//Because controls is down keys mandatory to release after pressing.
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
				
		
		
		String path="E:\\1sr_Apr_9AM_2021\\sample.txt";
		
		//Copytext text to clipbaord
		StringSelection SPath=new StringSelection(path);
		clipboard.setContents(SPath, SPath);
		
		//Press contrl+v shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Because controls is down keys mandatory to release after pressing.
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//Press Enter key to finish upload
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
