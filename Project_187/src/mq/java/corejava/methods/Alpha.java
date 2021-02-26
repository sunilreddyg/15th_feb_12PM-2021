package mq.java.corejava.methods;

public class Alpha 
{
	public void jump()
	{
		System.out.println("jump executed");
	}
	void run()
	{
		System.out.println("run executed");
	}
	public static void walk()
	{
		System.out.println("walk executed");
	}
	static void move()
	{
		System.out.println("move executed");
		
	}
	public static void main(String args[])
	{
		//Caling static methods with in class 
		walk();
		move();
		
		//Calling Instant methods With In class
		new Alpha().run();
		new Alpha().jump();
	}
}
 

