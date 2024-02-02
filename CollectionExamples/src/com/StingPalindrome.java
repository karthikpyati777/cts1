package com;

import java.util.Scanner;

public class StingPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a,b="";
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string = ");
		a=s.nextLine();
		int n=a.length();
		for(int i=n-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		if(b.equalsIgnoreCase(a)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
	}

}
