package com.karthik;

public class SumOfElementsInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//sum of array elements
		int[] a= {1,2,3,4,5};
//		int sum=0;
//		for(int i=0;i<a.length;i++)
//		{
//			sum=sum+a[i];
//		}
//		System.out.println(sum);
		
//		int max=a[0];
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]>max)
//				max= a[i];
//		}
//		System.out.println("maximum array eleemnt is :"+max);
		
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println(min);
	}

}
