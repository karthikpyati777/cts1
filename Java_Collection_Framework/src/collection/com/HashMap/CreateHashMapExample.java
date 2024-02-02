package collection.com.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CreateHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> m=new HashMap(); 
		m.put("mango", 50);
		m.put("banana", 40);
		m.put("papaya", 30);
		m.put("apple", 20);
		m.put(null, 60);
		m.put(null, 70);
		System.out.println(m);
		
		System.out.println(m.isEmpty());
		System.out.println(m.size());
		System.out.println(m.containsKey("mango"));
		System.out.println(m.containsValue(40));
		System.out.println(m.hashCode());
		System.out.println(m.get("apple"));
		System.out.println(m.remove("apple", 20));
		System.out.println(m);
		System.out.println(m.remove("banana"));
		System.out.println(m);
		
		//get only keys from hashmap
		  Set<String> s=m.keySet();
		  System.out.println(s);
		//get only values from hash map
		 Collection<Integer> c =m.values();
		 System.out.println(c);
		 
		 //different ways to iterate over hash map
		 //for each method
		 for(Map.Entry<String,Integer> entry:m.entrySet()) {
			 System.out.println("key ->"+ entry.getKey() +"value->"+ entry.getValue());
		 }
		 
		 //using iterator
		 Set<Map.Entry<String,Integer >> entries=m.entrySet();
		 Iterator<Map.Entry<String, Integer>> iterator=entries.iterator();
		 while(iterator.hasNext()) {
			 Map.Entry<String, Integer> entry=iterator.next();
			 System.out.println("key ->"+ entry.getKey() +"value->"+ entry.getValue());
			 
		 }
		 
		 //using java 8 forEach
		 m.forEach((K,V)->{
			 System.out.println(" k " + K);
			 System.out.println(" v " + V);
		 });
	}

}
