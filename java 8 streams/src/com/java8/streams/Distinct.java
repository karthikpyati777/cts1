package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l=Arrays.asList("car","Bike","CAR","Bike","Cycle");

		List<String> distinct=new  ArrayList<String>();
		
		distinct=l.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);
		
//		l.stream().distinct().forEach(value->System.out.println(value));
		l.stream().distinct().forEach(System.out::println);
		
		
	}

}
