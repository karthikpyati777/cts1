package com.basiccodes;

import java.util.Scanner;

public class primeornot {

	public static boolean isprime(int number)
	{
		int sqrt=(int) Math.sqrt(number)+1;
		for(int i=2;i<sqrt;i++)
		{
			if(number %i ==0)
			{
				return false;
			}
		}
	return true;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner s=new Scanner(System.in);
//		System.out.println("ente the number :");
//		int a=s.nextInt();
//		if(a%2==0)
//		{
//			System.out.println(" even number");
//		}
//		else
//			System.out.println("prime number");
		
		System.out.println(primeornot.isprime(3));


	}

}
