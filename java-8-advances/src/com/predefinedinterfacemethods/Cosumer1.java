package com.predefinedinterfacemethods;

import java.util.function.Consumer;

public class Cosumer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        Consumer<Integer> display = (x) -> System.out.println("I am displaying "+ x);
		       display.accept(10);
		    }
		
	

}
