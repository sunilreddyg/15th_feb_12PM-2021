package mq.java.corejava.variables;

public class Global_Variables
{
	/*
	 * These variable are global variables because it define 
	 * inside class and outside method
	 * 
	 */
	String name="MQ-DSNR";    			 //Instant variables access outside class with object creation
	public int Age=20;					//Because it has public modifier we can access outside package
	static double Course_fee=12000.00;  //Static variables access without object creation
	static final String browser_name="chrome";  //Because it has final keyword we can't ovveride value

	
	public static void main(String args[])
	{
		System.out.println(Course_fee=15000.00);    //-->OP-->15000.00
		
	}
	

}
