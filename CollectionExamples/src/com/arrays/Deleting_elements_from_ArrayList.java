package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deleting_elements_from_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a=new int[] {1,2,3,4,2,3};
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			l.add(a[i]);
		}
		l.remove(5);
//		l.remove(5);
        System.out.println("Before deletion :" + Arrays.toString(a));
        System.out.println("After Deletion:" + l);
		
	}

}
