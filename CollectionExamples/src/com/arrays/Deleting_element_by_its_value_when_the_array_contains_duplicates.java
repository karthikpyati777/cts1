package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deleting_element_by_its_value_when_the_array_contains_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int[]{1,2,3,3,4,5,6};
		ArrayList<Integer> l=new ArrayList<Integer>();
		int j=3;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=j) {
				l.add(a[i]);
			}
		}
 
		System.out.println("Before deletion :" + Arrays.toString(a));
        System.out.println("After deletion :" +l);
	}

}