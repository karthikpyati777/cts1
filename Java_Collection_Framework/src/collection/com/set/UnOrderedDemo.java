package collection.com.set;

import java.util.HashSet;
import java.util.Set;

public class UnOrderedDemo {

	//it is unOrdered collection
			public static void unOrderedDemo() {
				Set<String> s=new HashSet<String>();
				s.add("element1");
				s.add("element2");
				s.add("element4");
				s.add("element5");
				s.add("element7");
				s.add("element6");
				//display only one element
				System.out.println(s);
//				System.out.println(s.toString());
			}
			 //set can contain only one null value
			public   void nullValueDemo() {
				Set<String> s1=new HashSet<String>();
				s1.add(null);
				s1.add(null);
				System.out.println(s1.toString());
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              
		unOrderedDemo();
//		nullValueDemo();
		UnOrderedDemo u=new UnOrderedDemo ();
		u.nullValueDemo();
		
	}
	

}
