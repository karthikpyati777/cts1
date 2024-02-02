package com.predefinedinterfacemethods;

import java.util.function.Predicate;

public class Pedicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> p=x->x>18;
		if(p.test(19))
			System.out.println("Eligible to vote");
		else
			System.out.println("Not eligible to vote");
	}

}
