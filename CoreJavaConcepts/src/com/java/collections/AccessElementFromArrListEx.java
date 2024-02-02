package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AccessElementFromArrListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<Integer> l=new ArrayList();
//		l.add(4);
//		l.add(7);
//		l.add(2);
//		l.add(9);
//		l.add(6);
//		System.out.println(l);
//		System.out.println(l.isEmpty());
//		System.out.println(l.size());
//		System.out.println(l.get(3));
//		System.out.println(l.set(0, 10));
//		System.out.println(l);
//		System.out.println(l.remove(2));
//		System.out.println(l);
//		System.out.println(l.removeAll(l));
//		l.clear();
		
		//Iterating over ArrayList
		List<String> courses=Arrays.asList("C","C++","Java","MySql","Anualr","Spring Boot");
		//System.out.println(courses);
//		for(int i=0;i<courses.size();i++) {
//			System.out.println(courses.get(i));
//		}
		//enhanced for Each Loop
//		for(String s:courses) {
//			System.out.println(s);
//		}
		
		//basic loop with iterator
//		for (Iterator iterator = courses.iterator(); iterator.hasNext();) {
//			String course = (String) iterator.next();
//			System.out.println(course);
//			
//		}
//		
		//iterator with while loop
//		Iterator<String> iterator = courses.iterator();
//		while (iterator.hasNext()) {
//			String course = (String) iterator.next();
//			System.out.println(course);
//			
//		}
		
		//using java 8 stream + lambda
		
		courses.stream().forEach((s)->System.out.println(s));
		
		//java 8 forEach +lambda
		courses.forEach((f)->System.out.println(f));
	}

}
