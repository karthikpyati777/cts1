package collection.com.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList<String>();
		l.add("car");
		l.add("bike");
		l.add("bike");
		l.add("car");
		System.out.println(l);
		l.add(null);
		l.add(null);
		System.out.println(l);
		
         l.add("car");
         l.add("bike");
         l.add("boat");
         l.add("train");
         System.out.println(l);
         
         //access object/elements from the
         
         System.out.println(l.get(0));
         System.out.println(l.get(8));

	}

}
