package com.arrays;

import java.util.Scanner;

//Return an array from method
public class Ex3 {

	//method to return array elements
//	public static int[] readArray() {
//		int[] x= {10,20,30,40};
//		return x;
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//read array from a method
		int[] a=readArray();
		
		//display array elements
		System.out.println("Array Elements are :");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
	}
	
	static int[] readArray() {
		 int[] arr=null;
		 Scanner s=new Scanner(System.in);
		 int n=0;
		 
		 System.out.println("enter the number of elements :");
		 n=s.nextInt();
		 
		 arr=new int[n];
		 
		 System.out.println("enter the elements :");
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=s.nextInt();
		 }
		 return arr;
	}

}
