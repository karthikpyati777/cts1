package collection.com.hashSet;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetFromCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> s= new HashSet<>();
		s.add(2);
		s.add(4);
		s.add(6);
		s.add(8);
		s.add(10);
		
	Set<Integer> s1=new HashSet<Integer>(s);
	System.out.println(s1);
	
	Set<Integer> a=new HashSet<Integer>();
	a.add(12);
	
	a.add(14);
	a.add(16);
	a.add(18);
	a.add(20);
	s1.addAll(a);
	System.out.println(s1);
	}

}
