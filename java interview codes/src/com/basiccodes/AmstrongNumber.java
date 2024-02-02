package com.basiccodes;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
	int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("snter the number");
		int n=s.nextInt();
		int temp=n;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("amstrong number");
		else
			System.out.println("not amstrong number");

	}

}
