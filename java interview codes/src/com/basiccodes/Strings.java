package com.basiccodes;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string name :");
		String s1=s.nextLine();
		String s2=s.nextLine();
		if(s1.equals(s2))
		{
			System.out.println("the given 2 strings are equal");
		}
		
		else
			
			System.out.println("the given string are not compared");
	
		
	}

}
