package com.karthik;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    
    System.out.println("enter the number : ");
    
    int num=s.nextInt();
    
    int temp=num;
    
    int rev=0;
    
    while(num>0)
    {
    	rev=rev*10+num%10;
    	num=num/10;
    }
    if(temp==rev)
    	System.out.println("palindrome");
    else
    	System.out.println("not palindrome");
	}

}
