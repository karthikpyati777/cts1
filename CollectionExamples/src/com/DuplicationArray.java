package com;

public class DuplicationArray {

	public static void find(int a[]) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[i]==a[j]) {
					continue;
				}
			}
			System.out.println("dup found "+a[i]+" at index :"+i);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a= {1,2,3,3,4,5};
	    find(a);	
	}

}
