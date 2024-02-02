package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> s=Arrays.asList("Hi",null,"Bye" ,null, "GOODBoy","karthik");
		List<String> removeNull=new ArrayList();
		
	 
		removeNull=s.stream().filter(str->str!=null).collect(Collectors.toList());
		System.out.println(removeNull);
//		
//		s.stream().filter(str->str.length()>6 && str.length()<8).forEach(a->System.out.println(a));
//		
//		s.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println);
	}

}
