package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A4 {

	public static Integer[] addObj(Integer[] a,int position,int object) {
		List<Integer> l=new ArrayList<>(Arrays.asList(a));
		l.add(position, object);
	
         
		return l.toArray(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= {3,5,8,1,2,9};
	    int position=3;
        int object=23;
        System.out.println("Before Array objects : "+Arrays.toString(a));
        a=addObj(a, position, object);
        System.out.println("After adding elements into ArrayList object : "+Arrays.toString(a));
        
	}

}
