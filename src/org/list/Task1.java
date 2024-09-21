package org.list;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
public static void main(String[] args) {
	List< String>arraylist=new ArrayList<String>();
	arraylist.add( "car");
	arraylist.add( "ford");
	arraylist.add( "benz");
	arraylist.add( "tata");
	arraylist.add("buggati");
	arraylist.add( "ford");
	arraylist.add("buggati");
	 System.out.println(arraylist);
	 
	 //get print pana
	 System.out.println(arraylist.get( 2));
	 
	 //index
	 System.out.println( arraylist.indexOf( 5));
	 
	 //lastindex
	 System.out.println(arraylist.lastIndexOf("buggati"));
	 System.out.println(arraylist.indexOf(1));
	 
	 //another list all print
	 /*List< String>anotherList=new ArrayList<String>();
	 anotherList.addAll(arraylist);
	 System.out.println(anotherList);*/
	 
	 //another list clear
	 List< String>anotherList=new ArrayList<String>();
	 anotherList.clear();
	 
	 //remove
	 arraylist.remove(4);
	 System.out.println(arraylist);
	 
	 //remove
	 arraylist.remove( "buggati");
	 System.out.println( arraylist);
	 
	 //null
	 arraylist.add(null);
	 System.out.println( arraylist);
	 
	 //set for update
	 arraylist.set(0, "bmw");
	 System.out.println( arraylist);
	 
	 //is empty
	 System.out.println( arraylist.isEmpty());
	 
	 //importatn***Iterate
	 for (String string : arraylist) {
		System.out.println(string);
		
		 arraylist.set(0, "bmw");
		 System.out.println( "coffeelist");
		
		
	}
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	
}
}
