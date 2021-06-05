package corejava.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_Interface_Tree_Set {

	public static void main(String[] args) 
	{
		
		/*
		 * Set:--> Set is a collection interface class it doesn't allow
		 * 		   duplicate values to store.
		 * 		
		 * 			Set is a unorder collection of objects..
		 * 			TreeSet follow alphabetical order..
		 */
		
		
		Set<String> set=new TreeSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("two");
		set.add("five");
		set.add("six");
		set.add("seven");
		set.add("eight");
	
		//Remove object form collection
		set.remove("four");
		
		
		//Get Size of objects
		int Obj_Count=set.size();
		System.out.println("Object Count is --> "+Obj_Count);
		
		
		//Verify object contains at collection
		boolean flag=set.contains("four");
		System.out.println("Object available status is --> "+flag);
		
		
		//Read first iterator value
		String itr=set.iterator().next();
		System.out.println("First iterator value in collection is --> "+itr);
		
		
		//set.clear();   //This method clear all objects at collection...
		
		
		//Verify Collection Emtpy status
		boolean flag1=set.isEmpty();
		System.out.println("Collection empty status is --> "+flag1);
		
	

		//Read collection of objects using Foreach loop
		for (String EachItem : set) 
		{
			System.out.println(EachItem);
		}
		
		
		//Convert all iterations into Independent tokens
		Iterator<String> tokens=set.iterator();
		String Obj1=tokens.next();
		String Obj2=tokens.next();
		System.out.println("First token of object is --> "+Obj1);
		System.out.println("Second token of object is --> "+Obj2);
		
		while(tokens.hasNext())
		{
			String Each_tokens=tokens.next();
			System.out.println("=> "+Each_tokens);
		}
		
		
		

	}

}
