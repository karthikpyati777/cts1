package com.arrays;

import java.util.Arrays;

public class CompareTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a1[]= {2,3};
       int b1[]=a1;
       int c[]= {4,5};
       int d[]= {4,5};
       int e[]= a1;
       
       if(Arrays.equals(a1, e)) 
    	   System.out.println("equals");
       
       else
    	   System.out.println("Not equals");
       
       if(Arrays.equals(a1, c)) 
    	   System.out.println("equals");
       
       else
    	   System.out.println("Not equals");
       
       if(Arrays.equals(c, d)) 
    	   System.out.println("equals");
       
       else
    	   System.out.println("Not equals");
       if(Arrays.equals(e,d)) 
    	   System.out.println("equals");
       
       else
    	   System.out.println("Not equals");
	}

}
