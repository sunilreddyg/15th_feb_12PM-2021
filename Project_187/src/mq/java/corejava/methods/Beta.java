package mq.java.corejava.methods;

public class Beta {

	public static void main(String[] args)
	{
		/*
		 * Creating object for instant methods to call
		 * 			Classname obj=new Classname();
		 * 			obj.methodname();
		 */
		Alpha ref=new Alpha();
		ref.jump();
		ref.run();
		
		/*
		 * Calling Static methods from different class
		 * 			Classname.methodname();
		 */
		Alpha.walk();
		Alpha.move();
		
	}

}
