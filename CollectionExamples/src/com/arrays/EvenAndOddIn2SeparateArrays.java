package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddIn2SeparateArrays {

	private static void countEvenOrOdd(int[] a) {
		// TODO Auto-generated method stub
		int oddCount=0;
		int evenCount=0;
		int[] even=null;
		int[] odd=null;
		
//		for(int i=0;i<a.length;i++)
		for(int i:a){
			if(i%2==0)
				++evenCount;
		}
		oddCount=a.length-evenCount;
		
		even=new int[evenCount];
		odd=new int[oddCount];
		
		
		
		int i=0;
		int j=0;
		for(int num:a) {
			if(num%2==0) 
				even[i++]=num;
				else 
					odd[j++]=num;
			
		}
		System.out.println("even count : "+Arrays.toString(even));
		System.out.println("odd count : "+Arrays.toString(odd));
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

