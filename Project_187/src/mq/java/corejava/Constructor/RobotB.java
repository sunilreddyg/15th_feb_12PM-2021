package mq.java.corejava.Constructor;


public class RobotB {

	public RobotB() 
	{
		System.out.println("Robot Started");
	}
	
	void walk()
	{
		System.out.println("Walk Executed");
	}
	
	void run()
	{
		System.out.println("run executed");
	}
	
	public static void main(String args[])
	{
		//Calling only constructor
		new RobotB();
		
		//Calling Instant method using constructor
		new RobotB().walk();
		new RobotB().run();
		
		System.out.println("Object Creation:--->"+"\n");
		
		//Create object for class
		RobotB obj=new RobotB();
		obj.walk();
		obj.run();
	}

}
