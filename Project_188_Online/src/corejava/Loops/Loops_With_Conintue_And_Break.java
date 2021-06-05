package corejava.Loops;

public class Loops_With_Conintue_And_Break {

	public static void main(String[] args) 
	{
		
		String colors[]= {"red","blue","green","yellow","white","black","brown"};
		for (int i = 0; i < colors.length; i++) 
		{
			if(colors[i].equals("white"))
			{
				break;  //This keyword break iteration 
			}
			
			System.out.println(colors[i]);
		}
		
		
		
		
		for (int i = 0; i < colors.length; i++) 
		{
			
			if(colors[i].equals("yellow"))
			{
				continue;   //Skip Current Iteration..
			}
			
			System.out.println(colors[i]);
			
		}
		
		
		
		

	}

}
