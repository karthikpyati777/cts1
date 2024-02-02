package com.arrays;

import java.util.Scanner;

public class SecondLargestNumber1 {

	public static int secondLargest(int[] a) {

//		
     	int fmax=0;
		int smax=0;
		
		 fmax=a[0];
		 smax=a[0];
		for(int i=1;i<a.length;i++) {
			if(fmax<a[i]) {
				smax=fmax;
				fmax=a[i];
			}
			else if(smax<a[i]){
				smax=a[i];
			}
		
	}
		return smax;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s=new Scanner(System.in);
	
	System.out.println("enter the length of the array :");
	int n=s.nextInt();
	
	int[] a=new int[n];
	
	System.out.println("Enter the number of Elements :");
	
	for(int i=0;i<a.length;i++) {
		a[i]=s.nextInt();
		
	}
	System.out.println("second larget element is : "+secondLargest(a));

	}
		
	}

