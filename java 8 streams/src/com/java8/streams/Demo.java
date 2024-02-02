package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//count
//		long evencount=l.stream().filter(n->n%2==0).count();
//		System.out.println(evencount);
		
		//min()
	    Optional<Integer> minElement	=l.stream().min((val1,val2)->{
			                          return val1.compareTo(val2);
		
		                            });
	System.out.println(minElement.get());
	
	
	//max()
	
	Optional<Integer> maxElement	=l.stream().max((val1,val2)->{
        return val1.compareTo(val2);

      });
System.out.println(maxElement.get());
		

	}

}
