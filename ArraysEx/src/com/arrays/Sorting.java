package com.arrays;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
	
		int[] a= new int[5];
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("unsorted order is : ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Sorted Array is :");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
