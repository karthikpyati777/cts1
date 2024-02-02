package com.arrays;

import java.util.Scanner;

public class DeleteElementBySpecificPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size,loc,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements into the array");
		for(i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		System.out.println("Enter array location");
		loc=s.nextInt();
		for(i=loc;i<size-1;i++) {
			a[i]=a[i+1];
		}
		size--;
		for( i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
