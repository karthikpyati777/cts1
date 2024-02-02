package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertObjects {

	public static Integer[] addElement(Integer[] a,int element) {
		List<Integer> l=new ArrayList<>(Arrays.asList(a));
		l.add(element);
		return l.toArray(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= {1,2,4,5,78,9};
		int element=7;
		System.out.println("old Array : "+Arrays.toString(a));
		a=addElement(a,element);
		System.out.println("New Array : "+Arrays.toString(a));

	}

}
