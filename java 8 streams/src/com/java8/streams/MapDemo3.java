package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> mul=Arrays.asList(1,2,3,4,5);
		List<Integer> result=new ArrayList();
		
		
		for(int i:mul) {
			result.add(i*3);
		}
		System.out.println(result);
		
		
//		result=mul.stream().map(n->n*3).collect(Collectors.toList());
//		System.out.println(result);
		
//		mul.stream().map(n->n*3).forEach(r->System.out.println(r));
//		
//		
//		mul.stream().map(n->n*3).forEach(System.out::println);
		
	
	}
}
