package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyOrFindFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//findAny-> it return any of the object
		List<String> l=Arrays.asList("One","Two","Three","Four");
		List<Integer> i=Arrays.asList(2,5,6,8,1);
	
		
		        Optional o=l.stream().findAny();
		        System.out.println(o.get());

		        
		        //findFirst->it return first of in the stream list
		        
		        Optional o1=i.stream().findFirst();
		        System.out.println(o1.get());

	}

}
