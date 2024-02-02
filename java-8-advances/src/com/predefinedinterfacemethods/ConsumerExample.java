package com.predefinedinterfacemethods;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> s=a->System.out.println(a);
		Consumer<String> s1=a->System.out.println(a.length());
	//	Consumer<Integer> i=e->e*2;
		s.accept("karthik");
		s1.accept("car");
		//i.accept(2);
	}

}
