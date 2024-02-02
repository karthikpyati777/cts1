package com.java8.streams;

import java.util.Arrays;
import java.util.List;

public class ConvertingObjIntoToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l=Arrays.asList("A","B","C","1","2","3");
		
		Object[] a=l.stream().toArray();
		System.out.println(a);
		for(Object v:l) {
			System.out.print(v+" ");
		}
	}

}
