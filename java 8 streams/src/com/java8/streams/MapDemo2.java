package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> vehicles=Arrays.asList("Bus","Car","Bike");
		List<Integer> convertingToUpper=new ArrayList();
		

		for (String s : vehicles) {
		
			System.out.println("Length of the string is :"+s.length());
		}
	
//		convertingToUpper=vehicles.stream().map(s->s.length()).collect(Collectors.toList());
//		System.out.println(convertingToUpper);
		
//		vehicles.stream().map(s->s.length()).forEach(len->System.out.println(len));
		
		vehicles.stream().map(s->s.length()).forEach(System.out::println);
	}
	

}
