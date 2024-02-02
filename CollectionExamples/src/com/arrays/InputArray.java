package com.arrays;

import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int a[]=new int[4];
		
//		System.out.println("default values are");
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]+"\t");
	//	}
		System.out.println("enter the array elements are :");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("array elements are ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
