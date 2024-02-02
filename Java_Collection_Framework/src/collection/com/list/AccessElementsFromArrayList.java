package collection.com.list;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=new ArrayList<String>();
		s.add("karthik");
		s.add("pavan");
		s.add("bharath");
		s.add("sharath");
		s.add("puneeth");
		System.out.println(s);
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		System.out.println(s.get(2));
		System.out.println(s.set(3, "shilpa"));
		System.out.println(s);
		System.out.println(s.set(1, "pyati"));
		System.out.println(s);
		System.out.println(s.remove(1));
		System.out.println(s);
		
		

	}

}
