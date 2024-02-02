package com.karthik;

import java.util.Scanner;

public class CountTheNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=s.nextInt();
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println("number of digits : "+count);
	}

}
