package com.arrays;

public class CountingSameNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,1,2,6,7,5,4,1};
		int count=0;
		int element=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==element)
			count++;
		}
		System.out.print("repeaated element is : "+count);
	}

}
