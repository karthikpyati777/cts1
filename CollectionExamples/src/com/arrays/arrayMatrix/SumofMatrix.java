package com.arrays.arrayMatrix;

public class SumofMatrix {
	
	public static int addsum(int[][] a) {
		int sum=0;
		for(int[] i:a) {
			for(int j:i) {
				sum=sum+j;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{1,2},{3,4},{5,7}};
		
		int sum=addsum(a);
		
		System.out.println("sum of matrix element is : "+sum);
	}

}