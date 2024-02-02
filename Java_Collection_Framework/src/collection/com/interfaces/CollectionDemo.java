package collection.com.interfaces;

import java.util.ArrayList;
import java.util.Collection;


public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> c=new ArrayList<>();
		c.add("karthik");
		c.add("pavan");
		c.add("shilpa");
		c.remove("pavan");
//		c.contains("karthik");
		System.out.println(c.contains("karthik"));
		System.out.println(c);
		
		System.out.println(c.isEmpty());
		c.forEach((elements)->{
			System.out.println(elements);
		});
		c.clear();
		System.out.println(c);
	}

}
