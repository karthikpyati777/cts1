package com.karthik;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s=new Scanner(System.in);
         System.out.println("enter the number :");
         int num=s.nextInt();
         
         int temp=num;
         
        int sum=0;
        while(num>0)
        {
        	int rev=num%10;
        	sum=sum+rev*rev*rev*rev;
        	num=num/10;
        }
        if(sum==temp)
        	System.out.println("the given number is amstrong number");
        else
        	System.out.println("given number is not amstrong number");
	}

}
