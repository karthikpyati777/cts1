package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> l=new ArrayList<>();
		l.add(new Employee(2,"karthik",12));
		l.add(new Employee(6,"BHarath",8));
		l.add(new Employee(2,"Raghu",15));
		
//		Collections.sort(l, new AgeComparator());
//		for(Employee e:l) {
//			System.out.println(e.id+" "+e.name+" "+e.age);
//		}
		
		Collections.sort(l, new NameComparator());
		for(Employee e:l) {
			System.out.println(e.id+" "+e.name+" "+e.age);
		}

	}

}