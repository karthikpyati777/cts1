package com;

public class Plindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0,n=121,rem,temp;
		
		//System.out.println("enter the number "+n);
		
		temp=n;
		while(n>0) {
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}

	}

}
