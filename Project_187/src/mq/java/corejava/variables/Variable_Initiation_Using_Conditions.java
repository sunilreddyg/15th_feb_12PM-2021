package mq.java.corejava.variables;

public class Variable_Initiation_Using_Conditions {

	public static void main(String[] args) 
	{
		
		
		if(true)
		{
			String name="webdriver";
		}
		//System.out.println(name);     //This Syntax shows runtime error and ask to create local variable

	
		//Global inititaion...
		String toolname="WD";
		if(true)
		{
			toolname="Appium";
		}
		System.out.println(toolname);     //OP:--> Appium
		
		
		//Global initlization
		String browsername;
		if(true)
		{
			browsername="chrome";
		}
		System.out.println(browsername);     //OP:--> chrome
		
		
		
	}

}
