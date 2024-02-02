package com.predefinedinterfacemethods;

import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p=a->(a>10);
		System.out.println(p.test(12));

		System.out.println(p.test(1));
	}

}
