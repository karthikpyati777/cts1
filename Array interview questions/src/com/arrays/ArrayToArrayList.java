package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,7,4,3};
		
//		List l=Arrays.asList(arr);
//		System.out.println(l);
//		
//		
//		String[] s= {"KARTHIK","PARVEEN","PAVAN","PRASHANT"};
//		List l1=Arrays.asList(s);
//		System.out.println(l1);
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(4);
		l.add(3);
		l.add(17);
		l.add(5);
		
//		Object[] obj=l.toArray();
//		for (Object object : obj) {
//			System.out.print(object.toString()+" ");
//		}
		
		Integer[] arr1=new Integer[l.size()]; 
		arr1=l.toArray(arr1);
		for(Integer x:arr1) {
			System.out.println(x+" ");
		}
		

	}

}
