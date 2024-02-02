package com.arrays;

import java.util.Arrays;

public class RemoveElementUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = new int[]{1,2,3,4,5};
	        int[] arr_new = new int[arr.length-1];
	        int j=3;
	        for(int i=0, k=0;i<arr.length;i++){
	            if(i!=j){
	                arr_new[k]=arr[i];
	                k++;
	            }
	        }
	        System.out.println("Before deletion :" + Arrays.toString(arr));
	        System.out.println("After deletion :" + Arrays.toString(arr_new));
//		int j=2;
//		int k;
//		for(int i=0; i<a.length;i++) {
//			for(k=0;k<a.length;k++) {
//			
//				if(i!=j) {
//					b[k]=a[i];
//					k++;
//				}
//			}
//			
//		}
//		System.out.print("old array : "+Arrays.toString(a));
//		System.out.println("\n");
//		System.out.print("new  array : "+Arrays.toString(b));

	}

}
