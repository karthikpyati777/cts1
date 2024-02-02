package com.arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElement {

	public static void removeDuplicate(int[] a) {
		Set<Integer> s=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) 
			s.add(a[i]);
			//s.remove(s);
	
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,2,4,2,1,4,3,2,5};
		removeDuplicate(a);

	}

}
