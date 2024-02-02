package com;

import java.util.Scanner;

public class Challenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		if(n%2!=0) 
			System.out.println("Hello");
			else if(n%2==0) {
			if(n>0 && n<10) {
				System.out.println("Hi");
			}
			if(n>10 && n<20) {
				System.out.println("Hello");
			}
			if(n>20) {
				System.out.println("Bye");
			}
		}

	}
	}

