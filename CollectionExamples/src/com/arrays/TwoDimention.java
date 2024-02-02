package com.arrays;

import java.util.Arrays;

public class TwoDimention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2Dimensional
		//int a[][]= {{1,2},{5,6},{3,7}};
		
		//3Dimension
		int b[][][]={{{1,2},{5,6},{3,7}},{{3,5},{7,9},{2,3}}};
		
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				System.out.print(a[i][j]+" ");
//			}
		//}
		//System.out.println(Arrays.deepToString(a));
		System.out.println(Arrays.deepToString(b));
		
//		for(int[] i:a) {
//			for(int j:i)
//				System.out.print(j+" ");
		
		for(int[][] i:b ) {
			for(int[] j:i) {
				for(int z:j) {
					System.out.print(z+" ");
				}
			}
		}
		}

		
	}

//}
