package com.predefinedinterfacemethods;

import java.util.function.Predicate;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<String> s=a->(a.length()>7);
		System.out.println(s.test("karthik"));
	}

}
