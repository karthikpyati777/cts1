package com.arrays.arrayMatrix;

public class Subtractionoftwomatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows,cols;
		int[][] a=  {
			        	{11,12},
			        	{14,16},
			        	{18,19}
	            	};
		int[][] b=  {
	        	{10,11},
	        	{9,13},
	        	{10,13}
        	};
		 rows=a.length;
		 cols=a[0].length;
		System.out.println(rows);
		System.out.println(cols);
		
		int diff[][]=new int[rows][cols];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				diff[i][j]=a[i][j]-b[i][j];
			}
		}
		System.out.println("subtraction of two matrices");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++) {
				System.out.print(diff[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
