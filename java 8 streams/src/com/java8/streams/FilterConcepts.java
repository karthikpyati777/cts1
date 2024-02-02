package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l=Arrays.asList(1,2,3,4,5);
		List<Integer> even=new ArrayList<Integer>();
		//even=l.stream().filter(n->(n%2==0)).collect(Collectors.toList());
	//	l.stream().filter(n->n%2==0).forEach(s->System.out.println(s));
		//System.out.println(even);
		l.stream().filter(n->n%2==0).forEach(System.out::println);
	}

}
