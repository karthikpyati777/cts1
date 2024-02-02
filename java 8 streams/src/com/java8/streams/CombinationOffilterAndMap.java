package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	int salry;
	public Employee(int id, String name, int i) {
		super();
		this.id = id;
		this.name = name;
		this.salry = i;
	}
	
}
public class CombinationOffilterAndMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<Employee> l=new ArrayList<>();
//		l.add(new Employee(1, "karthik", 15000));
//		l.add(new Employee(2, "kumar", 17000));
//		
//		l.add(new Employee(4, "shwetha", 14000));
//		
//		l.add(new Employee(3, "sridhar", 16000));
		
		List<Employee> l=Arrays.asList(new Employee(1, "karthik", 15000),
				                      new Employee(2, "kumar", 17000),
						              new Employee(4, "shwetha", 14000),
								      new Employee(3, "sridhar", 16000));
		List<Integer> l1=l.stream().filter(e->e.salry>15000).map(e1->e1.salry+1000).collect(Collectors.toList());
		

		System.out.println(l1);
	}

}
