package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenationOfTwoStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> s1=Arrays.asList("one","two","three");
		List<Integer> s2=Arrays.asList(1,2,3);
		
		Stream<String> t1=s1.stream();
		Stream<Integer> t2=s2.stream();
		
		List<Object> x=Stream.concat(t1, t2).collect(Collectors.toList());
		
		for(Object o:x) {
			System.out.print(o+" ");
		}
	}

}
