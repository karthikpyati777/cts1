package com.arrays;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of Elements :");
		int n=s.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter the Array elements");
		
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("The array elements are :");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
