package com.predefinedinterfacemethods;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> f=s->s.length();
		System.out.println(f.apply("karthik"));

	}

}
