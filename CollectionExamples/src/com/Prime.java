package com;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(49));
		System.out.println(isPrime(48));

	}
	
	public static boolean isPrime(int n) {
		
		if(n==0 || n==1)
			return false;
		if(n==2)
			return true;
		
		for(int i=2;i<n/2;i++) {
			if(n%2==0) {
				return false;
			}
		}
		return true;
	}

}
