package corejava.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List_Inteface_Linkted_List {

	public static void main(String[] args) {
		
		/*
		 * List:--> List is a collection interface class it does allow
		 * 		   duplicate values to store.
		 * 		
		 * 			list is a inorder collection of obejcts
		 * 			.
		 */
		
		
		List<String> list=new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("two");
		list.add("five");
		list.add("six");
		list.add("seven");
		list.add("eight");
		
		
		
		/*
		 * Get:--> get is a list interface method this method retrieve
		 * 			single object from collection using it's index number..
		 */
		String obj=list.get(3);
		System.out.println("3rd index object is ---> "+obj);
		
	
		//Remove object form collection
		list.remove("four");
		
		
		//Get Size of objects
		int Obj_Count=list.size();
		System.out.println("Object Count is --> "+Obj_Count);
		
		
		//Verify object contains at collection
		boolean flag=list.contains("four");
		System.out.println("Object available status is --> "+flag);
		
		
		//Read first iterator value
		String itr=list.iterator().next();
		System.out.println("First iterator value in collection is --> "+itr);
		
		
		//list.clear();   //This method clear all objects at collection...
		
		
		//Verify Collection Emtpy status
		boolean flag1=list.isEmpty();
		System.out.println("Collection empty status is --> "+flag1);
		
		
		
		
		//Read all object using for loop
		for (int i = 0; i < list.size(); i++)
		{
			String Eachobj=list.get(i);
			System.out.println(Eachobj);
		}
		
		
	

		//Read collection of objects using Foreach loop
		for (String EachItem : list) 
		{
			System.out.println(EachItem);
		}
		
		
		//Convert all iterations into Independent tokens
		Iterator<String> tokens=list.iterator();
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
