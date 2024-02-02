package com.arrays;

public class CountEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {123,5,4,87,21,24};
		int evenCount=0;
		int oddCount=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				evenCount++;
			else
				oddCount++;
		}
		System.out.println("Total Number nunmber of evens : "+evenCount);
		System.out.println("Total Number nunmber of odds : "+oddCount);
	}

}
