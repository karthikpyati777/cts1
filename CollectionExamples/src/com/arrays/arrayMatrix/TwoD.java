package com.arrays.arrayMatrix;

public class TwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},{4,5},{8,9}};
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[0].length;j++) {
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}

		// for each loop
		for(int[] i:a) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
