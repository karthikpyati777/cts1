package com.arrays;

public class SumAndAvg {
	
	public static void main(String[] args) {
		int[] a= {2,5,3,4};
		int sum=0;
		int avg=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			avg=sum/a.length;
			
		}
		
		System.out.println("average of sum is : "+avg);
		System.out.println("sum is : "+sum);
		
	}

}
