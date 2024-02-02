package com.arrays;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,3,4,5};
		int[] b= {6,7,8,9,10};
		int c[]=new int[5];
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println("\n");
		for(int i=0;i<c.length;i++) {
			c[i]=a[i]+b[i];
			
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}

}
