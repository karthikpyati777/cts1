package com.arrays.arrayMatrix;

public class RowSumAndColSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows,cols,sumRow,sumCol;
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		rows=a.length;
		cols=a[0].length;
		
		for(int i=0;i<rows;i++) {
			sumRow=0;
			
			for(int j=0;j<cols;j++) {
				sumRow=sumRow+a[i][j];
			}
			System.out.print(sumRow+" ");
		}
//			System.out.println("\n");
//			for(int i1=0;i1<cols;i1++) {
//				sumCol=0;
//				for(int j=0;j<rows;j++) {
//					sumCol=sumCol+a[i1][j];
//				}
//				System.out.println(sumCol);
//		}
		System.out.println("\n");
		for(int i=0;i<cols;i++) {
			sumCol=0;
			for(int j=0;j<rows;j++) {
				sumCol=sumCol+a[j][i];
			}
			System.out.print(sumCol+" ");
		}

	}

}
