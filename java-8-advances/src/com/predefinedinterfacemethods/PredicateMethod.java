package com.predefinedinterfacemethods;

import java.util.function.Predicate;

public class PredicateMethod {

	public static boolean ageperson(int age) {
		if(age>18)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p=PredicateMethod::ageperson;
//		boolean b=p.test(21);
//		System.out.println(b);
		System.out.println(p.test(21));
		System.out.println(p.test(17));

	}

}
