package com.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l=Arrays.asList(2,6,4,1,7);
		
		List<String> str=Arrays.asList("CAR","BIKE","CYCLE","MOTORCYCLE");
		
		     List<Integer> s=l.stream().sorted().collect(Collectors.toList());
		     
		     System.out.println("values in ascending order :" +s);
		     
		     
		     List<Integer> s1=l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		     System.out.println("values in decending order :" +s1);
		     
		     
		     List<String> f=str.stream().sorted().collect(Collectors.toList());
		     System.out.println(f);
		     List<String> f1=str.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		     System.out.println(f1);
		     

	}

}
