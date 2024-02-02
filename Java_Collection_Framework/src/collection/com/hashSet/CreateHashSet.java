package collection.com.hashSet;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//unorder collection
		Set<String> s=new HashSet<String>();
		s.add("c");
		s.add("core java");
		s.add("python");
		System.out.println(s);

		//it does not add duplicate element
		s.add("core java");
		System.out.println(s);
	}

}
