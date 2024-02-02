package com.arrays;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {7,6,3,2,1};
		boolean found=false;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter num to be searched");
		int n=s.nextInt();
		 for(int i=0;i<a.length;i++) {
			 if(a[i]==n) {
				 found=true;
			 }
			 
		 }
		 if(found)
			 System.out.println("YES,The given  element is found");
		 else
			 System.out.println("No,The given  element is not found");
	}

}
