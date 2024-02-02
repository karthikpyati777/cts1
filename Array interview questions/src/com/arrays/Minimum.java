package com.arrays;

public class Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {3,6,9,2,4};
		int minimum=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<minimum)
				minimum=a[i];
		}
		
		System.out.println("minimum number is : "+minimum);

	}

}
