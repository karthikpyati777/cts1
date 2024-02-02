package collection.com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingArrayListInAscAndDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> s=Arrays.asList(2,4,67,1,5,9);
//		System.out.println(Collections.sort(s));
//		List<Integer> l=new ArrayList<Integer>();
//		l.add(2);
//		l.add(1);
//		l.add(4);
//		l.add(6);
//		l.add(5);
//		Collections.sort(l);
//		System.out.println(l);
//	Collections.reverse(l);
//	System.out.println(l);
//		

		List<Employee> e=new ArrayList<Employee>();
		e.add(new Employee(1, "karthik", 23, 230000.778));
		e.add(new Employee(4, "keerti", 24, 250000.778));
		e.add(new Employee(3, "affan", 27, 270000.778));
		e.add(new Employee(2, "bhavan", 28, 290000.778));
		
//		Collections.sort(e, new Mysort());
//		System.out.println(e);//ascending order
		
//		Collections.sort(e, new Mysort());
//		System.out.println(e);//descending order
		
		//anonymous interface 
//		Collections.sort(e, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return (int) (o2.getSalary()-o1.getSalary());
//			}
//		});
		
//		Collections.sort(e, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return (int) (o1.getSalary()-o2.getSalary());
//			}
//		});
		
		Collections.sort(e, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getName().compareTo(o2.getName()));
			}
		});
		System.out.println(e);
		
//		//using lambda expression and it is implementing the anonymous function
//		Collections.sort(e, (o1,o2)->(int)(o1.getSalary()-o2.getSalary()));
//		System.out.println(e);
		
		Collections.sort(e, (o1,o2)->(int)(o1.getName().compareTo(o2.getName())));
		System.out.println(e);
	}

}

// class Mysort implements Comparator<Employee>{
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		// TODO Auto-generated method stub
//		return (int) (o2.getSalary()-o1.getSalary());
//	}
//	
//}