package com.arrays;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,1,2,6,4};
//		Arrays.sort(a);
		Arrays.sort(a,0,3);
		System.out.println("sorted array is : "+Arrays.toString(a));

	}

}
