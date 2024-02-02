package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfTwoArrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements in first array :");
		int n1=s.nextInt();
		System.out.println("Enter number of elements in second array :");
		int n2=s.nextInt();
		int a[]=new int[n1];
		System.out.println("Enter first array elements :");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		int b[]=new int[n2];
		System.out.println("Enter second array elements :");
		for(int i=0;i<b.length;i++) {
			b[i]=s.nextInt();
		}
		int c[]=new int[n1];
		for(int i=0;i<c.length;i++) {
			c[i]=a[i]+b[i];
		}
		System.out.println("Resultant Array : "+Arrays.toString(c));
		
	}

}
