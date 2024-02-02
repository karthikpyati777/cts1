package collectionsInJava;

import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l=Arrays.asList(1,"karthik pyati",true,2,3,4,5,6,7);
		System.out.println(l);
		
		List<Integer> l1=Arrays.asList(1,2,3,4,45,7,2);
		System.out.println(l1);
		
		System.out.println(l1.size());
		
		System.out.println(l1.indexOf(45));
		System.out.println(l1.hashCode());
		System.out.println(l1.isEmpty());
		System.out.println(l1.lastIndexOf(7));
//		System.out.println(l1.remove(3));
		System.out.println(l1.get(3));
        System.out.println(l1.set(2, 7));
        System.out.println(l1);
 
       
	}

}
