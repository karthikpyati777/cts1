package com.arrays;

public class MergeTwoArray{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,1};
//		int c[]=new int[5];
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
//		for(int j=0;<b.length;j++) {
//			System.out.print(a[j]+" ");
//		}
		
		int a1=a.length;
		int b1=b.length;
		int c1=a1+b1;
		int[] c=new int[c1];
		for(int i=0;i<a1;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<a1;i++) {
			c[a1+i]=b[i];
		}
		for(int i=0;i<c1;i++) {
			System.out.print(c[i]+" ");
			
		}

	}
	

}
