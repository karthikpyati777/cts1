package com.arrays;

import java.util.ArrayList;

public class StringArrayIntoStringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a=new ArrayList();
		a.add("apple");
		a.add("banana");
		a.add("mango");
		System.out.println("ArrayList :"+a);
		
		String s[]=new String[a.size()];
		a.toArray(s);
		System.out.println("Array :");
		for(String item:s) {
			System.out.print(item+" ");
		}
		
	}

}
