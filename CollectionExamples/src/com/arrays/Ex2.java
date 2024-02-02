package com.arrays;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		
		//displaying default values
		System.out.println("Default values of array :");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		
		//initializing array
        System.out.println("\n\n***Initializing Arry***");	
        System.out.println(" Enter "+a.length+"integer values :");
        for(int i=0;i<a.length;i++) {
        	//read input
        	a[i]=s.nextInt();
        }
        System.out.println("\n\n***Initializing Array***");
        
        //displaying initialized values

        System.out.println("Array elements are ");
        for(int i=0;i<a.length;i++) {
        	System.out.print(a[i]+"\t");
        }
	}

}
