package com;

public class AmstrongNumber {

	
  public static void main(String[] args) {
	  
	  int sum=0,n=157,rem,temp;
		
		//System.out.println("enter the number "+n);
		
		temp=n;
		while(n>0) {
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("the given number is amstrong");
		}
		else {
			System.out.println("not amstrong number");
		}

  }
}
