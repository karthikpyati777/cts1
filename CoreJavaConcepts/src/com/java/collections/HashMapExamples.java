package com.java.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> m=new HashMap<>();
		m.put("karthik", 20000);
		m.put("hateli", 10000);
		System.out.println(m);
		m.put("chenna", 13000);
		m.put("naga", 14000);
		m.put("manju", 17000);
		System.out.println(m.containsKey("karthik"));
		System.out.println(m.containsValue( 10000));
		System.out.println(m.isEmpty());
		System.out.println(m.remove("chenna"));
		System.out.println(m);
		System.out.println(m.get("naga"));
		System.out.println(m);
		
		//get only keys from HashMap
	Set<String> keys=	m.keySet();
	System.out.println(keys);
	
	//get only values from HashMap
	Collection<Integer> collection=m.values();
	System.out.println(collection);
	
	//iterator over hashmap
	
	//simple forEach method
	
	for(Map.Entry<String, Integer> entry:m.entrySet()) {
		System.out.println("Key->" + entry.getKey() + " value->" + entry.getValue());
	}
	
	//using iterator
	

	//using java 8 feature

	m.forEach((K,V)->{
		System.out.println(" K "+K);
		System.out.println(" v "+V);
	});
	}

}
