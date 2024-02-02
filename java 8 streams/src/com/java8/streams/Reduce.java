package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=Arrays.asList("A","B","C","1","2","3");
		
		Optional<String> combineValue=l.stream().reduce((value,combinedValue)->
		                               {
		                            	   return combinedValue+value;
		                               });
		System.out.println(combineValue.get());
	}

	}

	
	
	            

