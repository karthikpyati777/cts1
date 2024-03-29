package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

//	//it's not contain duplicate values
//	private static void duplicateValueDemo() {
//		Set<String> s=new HashSet<>();
//		s.add("ele1");
//		s.add("ele1");
//		//display only one element
//		System.out.println(s.toString());
//	}
//	
//	private static void nullValueDemo() {
//		//it allows null value
//		Set<String> s=new HashSet<>();
//		s.add(null);
//		s.add(null);
//		//display only one element
//		System.out.println(s.toString());
//	}
//	
//	private static void unOrderDemo() {
//		//it does not maintain order list of elements
//		Set<Integer> s=new HashSet<>();
//		s.add(3);
//		s.add(2);
//		s.add(1);
//		s.add(7);
//		s.add(4);
//		//display  elements
//		System.out.println(s.toString());
//	}
//	
	
	public static void main(String[] args) {
	
//		duplicateValueDemo();
//		 nullValueDemo();
//		 unOrderDemo();
//		Set<Integer> s=new HashSet<>();
//		s.add(3);
//		s.add(2);
//		s.add(1);
//		s.add(2);
//		s.add(7);
//		s.add(4);
//		//display  elements
//		System.out.println(s);
//		
		
		//creating hashSet from another collection
		
		Set<Integer> firstFiveEven=new HashSet();
		firstFiveEven.add(2);
		firstFiveEven.add(4);
		firstFiveEven.add(6);
		firstFiveEven.add(8);
		firstFiveEven.add(10);
		Set<Integer> tenEvennumbers=new HashSet<>(firstFiveEven);
		System.out.println( tenEvennumbers);
		
		Set<Integer> nextFiveEvenNumbers=new HashSet<Integer>();
		nextFiveEvenNumbers.add(12);
		nextFiveEvenNumbers.add(14);
		nextFiveEvenNumbers.add(16);
		nextFiveEvenNumbers.add(18);
		nextFiveEvenNumbers.add(20);
		System.out.println(nextFiveEvenNumbers);
		
		System.out.println(tenEvennumbers.addAll(nextFiveEvenNumbers));
		System.out.println(tenEvennumbers);
		System.out.println(tenEvennumbers.remove(20));
		System.out.println(tenEvennumbers);
		
		for(int i:tenEvennumbers) {
			System.out.print(i+" ");
		}
		for (Iterator iterator = nextFiveEvenNumbers.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			
		}
		Iterator iterator = nextFiveEvenNumbers.iterator();
		while (iterator.hasNext()) {
			Integer type = (Integer) iterator.next();
			System.out.print(type+" ");
			
		}
		

	}

}
