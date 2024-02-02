package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class Array3 {
	
	public void removeDuplicateElement(int[] a) {
		Set<Integer> s=new HashSet();
		for(int i=0;i<a.length;i++) {
			s.add(a[i]);
		}
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {2,4,1,2,5,3,4,7,6,5};
		Array3 a1=new Array3();

		a1.removeDuplicateElement(a);

	}

}
