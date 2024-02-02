package com.arrays;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,4,7,1};
		int maximum=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>maximum) {
				maximum=a[i];
			}
		}

		System.out.println("maximum number is : "+maximum);
	}

}
