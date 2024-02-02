package com.arrays;

import java.util.Scanner;




public class CountEvenOrOdd {

	private static void countEvenOrOdd(int[] a) {
		// TODO Auto-generated method stub
		int oddCount=0;
		int evenCount=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				++evenCount;
			else
				++oddCount;
		}
		
		System.out.println("even count : "+evenCount);
		System.out.println("odd count : "+oddCount);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number of elements :");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			
		}
			countEvenOrOdd(a);
		
	}
}


