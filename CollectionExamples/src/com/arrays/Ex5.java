package com.arrays;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=0;
		int[] x=null;
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the number of elements :");
		n=s.nextInt();
		
		x=new int[n];
		
		System.out.println("enter the number of elements :");
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		System.out.println(" Enter the Array Elements are :");
		for(int i=0;i<x.length;i++) {
		 x[i]=s.nextInt();
		}
		System.out.println("Array Elements are :");
		
		for(int i=0;i<x.length;i++) {
			System.out.println("Array Elements is : " +x[i]);
		}
	}

}
