package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertElement {

	public static Integer[] addElementSpecificPos(Integer[] a,int position,int object) {
		List<Integer> l=new ArrayList<>(Arrays.asList(a));
		l.add(position, object);
	
         
		return l.toArray(a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= {1,2,1,5,7};
		int position=3;
		int object=45;
	
		System.out.println("old Array : "+Arrays.toString(a));
		a= addElementSpecificPos(a,position,object);
		System.out.println("new Array : "+Arrays.toString(a));
		
		
		
		

	}

}
