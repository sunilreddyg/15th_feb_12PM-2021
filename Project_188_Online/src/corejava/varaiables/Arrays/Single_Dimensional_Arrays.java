package corejava.varaiables.Arrays;

public class Single_Dimensional_Arrays {

	public static void main(String[] args)
	{
		
		
		//Static array
		String arrayname[]=new String[4];
		arrayname[0]="Samsung";
		arrayname[1]="Iphone";
		arrayname[2]="Oneplus";
		arrayname[3]="Vivo";
		
		System.out.println("object count is --> "+arrayname.length);
		
		
		
		//Runtime array
		String RuntimeArray[]= {"Samsung","Iphone","Oneplus","Vivo","Blackberry"};
		System.out.println(RuntimeArray[4]);
		
		System.out.println("Object count is ---> "+RuntimeArray.length);
		
		
		
		//Static Array to Store Different Array values
		Object obj[]= {"iPhone",120000.00};
		System.out.println("Phone name is --> "+obj[0]);
		System.out.println("Phone price is --> "+obj[1]);

	}

}
