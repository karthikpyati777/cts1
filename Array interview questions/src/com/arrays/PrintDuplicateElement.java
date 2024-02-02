package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateElement {

	public static void removeDuplicateElement(int a[]) {
		
		Set<Integer> s=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			s.add(a[i]);
		}
		
		System.out.println(s);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,4,3,1,5,6,2,3};
		
		removeDuplicateElement(a);
		
	}

}
