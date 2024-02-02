package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<Integer> l=Arrays.asList(1,2,4,5,7);
		
//		List<Integer> list=l.stream().map(s->s*3).collect(Collectors.toList());
//		System.out.println(list);
		
	//	l.stream().map(s->s*3).forEach(s->System.out.print(s+" "));
		
		//l.stream().map(s->s*3).forEach(System.out::println);
		
		List<String> l=Arrays.asList("bus","car","bike");
		
	List<String> upperwords=	l.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
	System.out.println(upperwords);
	
	List<Integer> u=l.stream().map(len->len.length()).collect(Collectors.toList());
	System.out.println(u);
		
	l.stream().map(len->len.length()).forEach(s->System.out.println(s));
	}

}
