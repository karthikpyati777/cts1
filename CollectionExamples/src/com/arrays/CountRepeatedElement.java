package com.arrays;

public class CountRepeatedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,5,3,5};
         int ele=3;
         int count=0;
         for(int i=0;i<a.length;i++) {
        	 if(a[i]==ele)
        		 count++;
        	 System.out.println("The repeated element is : "+a[i]+" "+count);
         }
//         System.out.println("The repeated element is : "+a[i]+" "+count);
	}

}
