package com;

import java.util.Scanner;

public class AcceptInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number :");
		int a=s.nextInt();
		System.out.println("Enter b number :");
		int b=s.nextInt();
		s.close();
		int z=a+b;
		
		System.out.println("sum = "+z);
	}

}
