package com.patterns.org;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=3;j>=i;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
		
		//or
		
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=1;j--)
			{
				if(j>i)
					System.out.print(" ");
				else
					System.out.print(" *");
			}
			System.out.println();
		}
		

	}

}
