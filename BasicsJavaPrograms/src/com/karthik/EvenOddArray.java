package com.karthik;

public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even numbers are :"+a[i]);
			}
			
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println("odd numbers are :"+a[i]);
			}
			
		}
		

	}

}
