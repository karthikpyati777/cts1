package com.arrays;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[]= {3,5,1,2,7};
//		int b[]= a;
//		a[0]=1;
//		
//		System.out.println(b.length);
//		for(int num:b) {
//			System.out.print(num+" ");
//			
//		}
		int a[]= {1,2,3,4,5,6};
		int b[]=new int[a.length];
		
		for(int i=0;i<b.length;i++) {
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));
		
		

	}

}
