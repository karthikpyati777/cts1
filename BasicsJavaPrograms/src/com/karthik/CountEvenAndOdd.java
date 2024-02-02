package com.karthik;

import java.util.Scanner;

public class CountEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the number :");
		 int num=s.nextInt();
		 int count=0,count1=0;
		 int rem;
		
		 while(num>0)
		 {
			 
			 rem=num%10;
			 if(rem%2==0)
			 {
				 count++;
				 
			 }
			 else
			 {
				 count1++;
				 
			 }
			 
			 num=num/10;
			 
			 
		 }
		 System.out.println("even digits  :" +count);
		 System.out.println("odd digits :"+count1);
		

	}

}
