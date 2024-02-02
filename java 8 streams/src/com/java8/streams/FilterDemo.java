package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> s=Arrays.asList("Hi","Bye","GOODBoy","karthik");
		List<String> longname=new ArrayList();
		
		longname=s.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());
		System.out.println(longname);
		
		s.stream().filter(str->str.length()>6 && str.length()<8).forEach(a->System.out.println(a));
		
		s.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println);
	}

}
