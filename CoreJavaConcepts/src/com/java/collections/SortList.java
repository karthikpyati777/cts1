package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
	public static void main(String[] args) {
//		List<Integer> l=Arrays.asList(30,20,40,10,25);
//		Collections.sort(l);
//		System.out.println(l);
//		Collections.reverse(l);
//		System.out.println(l);
//	}

	//custom sorting
		List<Employee> e=new ArrayList();
		e.add(new Employee(1, "karthik", 23, 190000));
		e.add(new Employee(2, "shankya", 25, 100000));
		e.add(new Employee(3, "jeevan", 21, 120000));
		e.add(new Employee(4, "guru", 29, 110000));
//		System.out.println(e);
////		
//		Collections.sort(e, new MySort());
//		System.out.println(e);
		
		//Anonymus implementation
		Collections.sort(e, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return  (int) (o1.getSalary()-o2.getSalary());
				
			}
			
			public int compare1(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return  (int) (o1.getName().compareTo(o2.getName()));
				
			}
			
		});
	
		Collections.sort(e, (o1, o2)-> (int)(o2.getSalary()-o2.getSalary()));
		System.out.println(e);
           
		
		Collections.sort(e, (o1, o2)->(int)(o1.getName().compareTo(o2.getName())));
		System.out.println(e);
			
		}
		
	}
	
	

class MySort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int) ((int) o1.getSalary()-o2.getSalary());
	}
	
}
