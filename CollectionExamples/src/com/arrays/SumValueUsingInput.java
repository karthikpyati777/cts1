package com.arrays;

import java.util.Scanner;

public class SumValueUsingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
//		int a[]=new int[4];
		int sum=0;
		System.out.println("enter the number of elements :");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array element");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
	System.out.println(" sum :"+sum );
	
		
	}

}
