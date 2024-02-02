package com;

import java.util.Scanner;

public class Solution {

	public static void checkEvenOrOdd(int a) {
		if(a%2==0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			System.out.println("Enter the value");
			checkEvenOrOdd(s.nextInt());
			
		}
	}

}
