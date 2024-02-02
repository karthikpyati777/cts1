package com.karthik;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		int n=111,r,sum=0;
//		int temp=n;
//		while(n>0)
//		{
//			r=n%10;
//			sum=sum*10+r;
//			n=n/10;
//		}
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the number :");
		int n=s.nextInt();
//		int r=0;
//		while(n>0)
//		{
//			r=r*10+n%10;
//			n=n/10;
//		}
//		System.out.println("the reverese number is : "+r);
//		
//		StringBuffer sb=new StringBuffer(String.valueOf(n));
//		StringBuffer rev=sb.reverse();
//		System.out.println("the reverse number is :"+rev);
//		
		StringBuilder sbl=new StringBuilder();
		sbl.append(n);
		
		StringBuilder rev=sbl.reverse();
		System.out.println("reverese number is : "+rev);

	}

}
