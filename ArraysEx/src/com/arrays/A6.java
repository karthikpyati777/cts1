package com.arrays;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int found=-1;
		int a[]= {1,4,7,5,9};
		System.out.println("Enter the number");
		int n=s.nextInt();
		for(int i=0;i<a.length;i++) {
			if(n==a[i]) {
				found=i;
				break;
			}
		}


		if(found>-1) 
			System.out.println("Yes,The element is present with index is :"+found);
		
		else 
			System.out.println(",The element is present with index is :"+found);
		
	}

}
