package com.arrays.arrayMatrix;

public class SumOfDigonalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a= {{1,2},{3,4}};
		
		int sum1=0;
	
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j)
					sum1=sum1+a[i][j];
				
			}
		}
	
		System.out.println(sum1);
	}
}