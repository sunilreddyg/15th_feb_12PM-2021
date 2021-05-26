package robot_window_interface;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robot_with_Noteapd_File {

	public static void main(String[] args) throws IOException, Exception 
	{
		
		//Open notepad file at runtime suing java program
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(200);
		
		//Using robot type <<   Hello world!  >>
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		robot.keyPress(KeyEvent.VK_W);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_D);
		
		
		
		
		
		
		

	}

}
