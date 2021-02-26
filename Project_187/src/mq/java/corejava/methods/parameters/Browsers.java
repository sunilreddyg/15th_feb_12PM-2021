package mq.java.corejava.methods.parameters;

public class Browsers 
{
	//Method without parameter
	void launch_chrome_browser()
	{
		System.out.println("chrome browser launched");
	}
	
	//Method with Parameter
	void Open_Browser(String browsername)
	{
		System.out.println(browsername+"--> Browser Launched");
	}

	public static void main(String[] args) 
	{
		
		Browsers obj=new Browsers();
		obj.Open_Browser("chrome");
		obj.Open_Browser("safari");
		obj.Open_Browser("opera");

	}

}
