package com.karthik;

import java.util.Arrays;

public class equalornotinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a= {1,2,3,4,5};
		int []b= {1,2,3,4,5};
		
		 boolean status=Arrays.equals(a,b);
		 if(status==true)
		 {
			 System.out.println("arrays are equals");
		 }
		 else
		 {
			 System.out.println("arrays are not equal");
		 }

	}

}
