package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntoStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] vegetables= {"tomoto","carrot","drumStick"};
		
		for(int i=0;i<vegetables.length;i++) {
			System.out.print(vegetables[i]+" ");
		}
		
		ArrayList al=new ArrayList(Arrays.asList(vegetables));
		System.out.println(al);
		
	}

}
