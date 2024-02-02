package collection.com.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSearchIterationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> l=new LinkedList<>();
		l.add("banana");
		l.add("apple");
		l.add("mango");
		l.add("mango");
		l.add("watermilon");
		System.out.println(l);
		System.out.println(l.contains("apple"));
		
		//find the index of the first occurance of an element in the linked list
		
		System.out.println(l.indexOf("apple"));
		
		//find the index of the Last occurance of an element in the linked list
		
		System.out.println(l.lastIndexOf("mango"));
		
		//iterator
	    
		//forEach
		//for each advanced loop
		//simple for loop
		
		

	}

}
