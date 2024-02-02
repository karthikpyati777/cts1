package collection.com.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferenrWaysToIterateOverList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> l=Arrays.asList("c","c++","java",".net","c#","Angular");
		//System.out.println(l);
//
//		for(int i=0;i<l.size();i++)
//		{
//			System.out.println(l.get(i));
//		}
//		for (String string : l) {
//			
//			System.out.println("programming  language : "+string);
//		}
		//basic loop with iterator
//		for (Iterator iterator = l.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
//			System.out.println(string);
//			
//		}
		//iterator with while loop
//		Iterator<String> iterator = l.iterator();
//		while (iterator.hasNext()) {
//			String string = (String) iterator.next();
//			System.out.println(string);
//			
//		}
		//java 8 stream + lambda examples
		List<String> courses=Arrays.asList("c","c++","java",".net","c#","Angular");
		//courses.stream().forEach(course -> System.out.println(course));
		
		//java 8 forEach + lambda examples
		
		courses.forEach((course)->System.out.println(course));
	}
	
	
	
}
