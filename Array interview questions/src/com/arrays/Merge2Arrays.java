package com.arrays;

public class Merge2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		int x=a.length;
		int y=b.length;
		int z=x+y;
		int c[]=new int[z];
		System.out.println("enter the first Array Elements");
		for(int i=0;i<x;i++) {
			c[i]=a[i];
			
			System.out.print(c[i]+" ");
			
		}
		System.out.println();

		System.out.println("merge first array element with second array element");
		for(int i=0;i<y;i++) {
			c[i+x]=b[i];
			
			System.out.print(c[i+x]+" ");
		}
		
		System.out.println();
		System.out.println("Merge elements are :");
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}

}
