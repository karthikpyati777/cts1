package com.arrays;

public class SecondLargestNumber {

//	public static int secondLargest(int[] input) {
//		
//		int firstLargest,secondLargest;
//		
//		if(input[0]>input[1])
//		{
//			firstLargest=input[0];
//			secondLargest=input[1];
//		}
//		else {
//			firstLargest=input[1];
//			secondLargest=input[0];
//		}
//		
//		for(int i=2;i<input.length;i++) {
//			if(input[i]>firstLargest) {
//				secondLargest=firstLargest;
//				firstLargest=input[i];
//				
//			}
//		
//		
//		else if(input[i]<firstLargest &&input[i]>secondLargest) {
//			
//			secondLargest=input[i];
//		}
//		}
//		
//		return secondLargest;
//	}
	public static void main(String[] args) {
//		
//		System.out.println(secondLargest(new int[] {1,4,3,26,78,56}));
//		System.out.println(secondLargest(new int[] {1,54,3,26,78,56}));
//		System.out.println(secondLargest(new int[] {1,44,63,26,78,56}));
		
		
		int a=4;
		int b=2;
		int c=3;
		
		int x=(a>b?a:b);
		System.out.println("First Largest Number is : "+x);
		int y=(x<c?x:c);
		System.out.println("Second Largest Number is : "+y);
	}
}
