package corejava.varaiables.Arrays;

public class Double_Dimensional_Arrays {

	public static void main(String[] args) 
	{
		
		//Static Double Dimensional array
		String data[][]=new String[3][2];
		
		data[0][0]="Prabha";
		data[0][1]="@123";
		
		data[1][0]="Aakash";
		data[1][1]="Ak@123";
		
		data[2][0]="Smitha";
		data[2][1]="Smt@123";
		
		
		//Print aakash name
		System.out.println(data[1][0]);
		
		System.out.println("Row count of double dimensional  "+data.length);
		
		
		
		
		//Runtime Double Dimensional array
		
		String userinfo[][]=
			{
					{"Radhika","EMP001","HYD"},
					{"Ravi","EMP002",null},
					{"Divya","EMP003",null},
					{"praveen","EMP004","VIZ"},
					
			};
		
		//print ravi name
		System.out.println(userinfo[1][0]);
		//print divya employee code
		System.out.println(userinfo[2][1]);
		
		
		System.out.println("Row count of double dimensional  "+userinfo.length);
		
	}

}
