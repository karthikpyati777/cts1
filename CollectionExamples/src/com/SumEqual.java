package com;

import java.util.Scanner;

public class SumEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int equal=6,r,sum=0,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=s.nextInt();
		
		temp=equal;
		while(n>0) {
			r=n%10;
			sum =sum+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("sum is equal");
		else 
			System.out.println("sum is not equal");
	}

}
