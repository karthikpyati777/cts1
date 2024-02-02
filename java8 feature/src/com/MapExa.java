package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> l=Arrays.asList(1,2,3,4,5);
		List<Integer> s=l.stream().map(x->x+x).collect(Collectors.toList());
		System.out.println(s);
		
		
		List<String> s1=Arrays.asList("parthi","syati","ks");
		List<String> s2=s1.stream().filter(k->k.startsWith(k)).collect(Collectors.toList());
		System.out.println(s2);

	}

}
