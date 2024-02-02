package com.predefinedinterfacemethods;

import java.util.function.Function;

public class Function1 {

	public static void main(String[] args) {
	
		        Function<Integer,Integer> calculator = (x) -> 4*4;
		        System.out.println("Square : "+calculator.apply(4));
		    
		
		       


	}

}


