package collection.com.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DifferentWaysToIterateSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
      Set<String> s=new HashSet<>();
      s.add("c");
      s.add("java");
      s.add("python");
      
      //enhanced forloop
      
//       for (String string : s) {
//		System.out.println(string);
//	}
       
       // Basic loop with iterator
//       for (Iterator iterator = s.iterator(); iterator.hasNext();) {
//		String string = (String) iterator.next();
//		System.out.println(string);
		
		//while loop with iterator

//		Iterator<String> iterator = s.iterator();
//		while (iterator.hasNext()) {
//			String object = (String) iterator.next();
//			System.out.println(object);
//			
//		}
		
		// JDK 8 forEach() with lambda
      
//      s.forEach((a)->System.out.println(a));
      
      //JDK 8 streaming + forEach() + lamdda Expression        
      s.stream().filter(course-> !"java".equals(course)).forEach(course->System.out.println(course));
      
		
	}
                 
	}


