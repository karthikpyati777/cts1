package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<Integer> l=new ArrayList();
//		
//		l.add(1);
//		l.add(4);
//		l.add(6);
//		l.add(7);
//		System.out.println(l);
		
		List<Integer> l=Arrays.asList(4,6,7,17,8,2,3,5,19);
		List<Integer> even=new ArrayList();
		
//		for(int i:l) {
//			if(i%2==0)
//			System.out.print(i+" ");
//		}
//		for(int n:l)
//		{
//			if(n%2==0)
//				even.add(n);
//		}
//		System.out.println(even);
		
		even=l.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		l.stream().filter(n->n%2==0).forEach(n->System.out.print(n+" "));
		l.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
	}

}
