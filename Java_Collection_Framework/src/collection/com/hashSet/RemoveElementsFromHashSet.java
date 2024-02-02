package collection.com.hashSet;

import java.util.HashSet;
import java.util.Set;

public class RemoveElementsFromHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> s=new HashSet<Integer>();
		s.add(1);
		s.add(3);
		s.add(5);
		
		Set<Integer> s1=new HashSet<Integer>(s);
		System.out.println(s1);
		
		Set<Integer> s2=new HashSet<Integer>();
		s2.add(7);
		s2.add(11);s2.add(13);
		s1.addAll(s2);
		s1.removeAll(s);
		System.out.println(s1);
		

	}

}
