package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a= {1,4,3,2,6,7,4,1};
		Integer[] b= {4,1,6,9,10,11,4};
		
		Set<Integer> s1=new HashSet<Integer>(Arrays.asList(a));
		Set<Integer> s2=new HashSet<Integer>(Arrays.asList(b));
		
		s1.retainAll(s2);
		System.out.println(s1);
		
//		Set<Integer> h=new HashSet<Integer>();
//		
//		for(int i=0;i<a.length;i++) {
//			
//			for(int j=0;j<b.length;j++) {
//				
//				if(a[i].equals(b[j])) {
//					h.add(a[i]);
//				}
//				
//			}
//		}
//		
//		System.out.println(h);
//		
		
	}

}
