package com.karthik;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);

		System.out.println("enter the string name :");
		
		String s1=s.next();
		String temp=s1;
		String rev="";
		
		int l=s1.length();
		
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		if(rev.equals(temp))
			System.out.println("palindrome");
		else 
			System.out.println("not palindrome");
	}

}
