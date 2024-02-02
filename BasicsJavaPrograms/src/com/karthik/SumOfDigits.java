package com.karthik;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number :");
		int n=sc.nextInt();
		  int sum=0,rem;
		 while(n>0)
		 {
			 rem=n%10;
			 sum=sum+rem;
			 n=n/10;
		 }
		 
		 System.out.println(sum);

	}

}
