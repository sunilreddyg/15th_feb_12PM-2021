package mq.java.corejava.methods.parameters;

public class Multiple_Parameters 
{
	
	
	void print_tool(String toolname,double toolprice)
	{
		System.out.println(toolname);
		System.out.println(toolprice);
	}
	

	public static void main(String[] args) 
	{
		Multiple_Parameters obj=new Multiple_Parameters();
		obj.print_tool("Webdriver", 1000.00);
		obj.print_tool("QTP", 12000.02);
		obj.print_tool("Cucumber", 1250.02);
	}

}
