package com.karthik;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		int a=4;
//		int b=6;
//		int c=3;
//		if(a>b&& a>c)
//			System.out.println(" A is the largest number");
//		else if(b>a&& b>c)
//			System.out.println("B is sthe largest");
//		else
//			System.out.println("C i sthe llargest");
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number :");
		int x=s.nextInt();
		System.out.println("enter second number :");
		int y=s.nextInt();
		System.out.println("enter third number :" );
		int z=s.nextInt();
		
	int a=x>y?x:y;
		int b=a>z?a:z;
		
		//int b=(x>y?x:y)>z?(x>y?x:y):z;
		System.out.println(b+" : is the largest number");
		
	}

}
