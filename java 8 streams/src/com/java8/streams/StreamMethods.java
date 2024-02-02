package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//non terminals : distinct(),limit() or processing elements
		List<Integer> l=Arrays.asList(1,2,4,1,2,3,4,5,6,7,5);
//		List<Integer> obj=l.stream().distinct().collect(Collectors.toList());
//		System.out.println(obj);
		l.stream().distinct().forEach(value->System.out.print(value+" "));
		
		//count() it is a terminal method
		

		System.out.println();
		long s=l.stream().distinct().count();
		System.out.println("toal number od objects after removing repetated valus : "+s);
		
		//limit it is a non terminal method
		
		List<Integer> s1=l.stream().limit(5).collect(Collectors.toList());
		System.out.println(s1);
		
		l.stream().limit(5).forEach(v->System.out.println(v));
		
		
	//	terminal methods: min(),max()
		
		List<Integer> numberList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//count()
		long w=numberList.stream().filter(n->n%2==0).count();
		System.out.print(w+" ");
		
		System.out.println();
		//min()
		Optional<Integer> min=numberList.stream().min((val1,val2)->{
			                                  return val1.compareTo(val2);
			                                });
		
		
		System.out.print(min.get()+" ");
		
		Optional<Integer> max=numberList.stream().max((val1,val2)->{
            return val1.compareTo(val2);
          });


          System.out.print(max.get()+" ");
		
          
          // reduce is a terminal method
          //it combines the objects into single object or into one single stream
          
          List<String> reduce=Arrays.asList("A","B","C","1","2");
       Optional<String>  r =reduce.stream().reduce((value, combinedValue)->{
        	                      return value+combinedValue;
          });
          System.out.println(r.get());
          
          List<String> s3=Arrays.asList("car","bike","cycle");
          
          Object arr[]=s3.stream().toArray();
          
          System.out.println(arr.length);
          
          for(Object o:arr) {
        	  
        	  System.out.print(o+" ");
          }
	}

}
