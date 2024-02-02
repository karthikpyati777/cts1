package com.java8.streams.combinationOfFilterAndMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int empId;
	String empName;
	int salry;
	public Employee(int empId, String empName, int salry) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salry = salry;
	}
	
	
}
public class FilterAndMap {

	public static void main(String[] args) {
		
		List<Employee> l=Arrays.asList(new Employee(101, "karthik", 20000),
				                       new Employee(102, "karthik", 10000),
						               new Employee(103, "karthik", 50000),
						               new Employee(104, "abhi", 40000));
		
//		List<Employee> res=new ArrayList<Employee>();
//		
		
		//combination of filter and map
		
	List<Integer> employeeSalIncrement=	l.stream().filter(s->s.salry>13000)
				.map(e->e.salry+1000).collect(Collectors.toList());
	System.out.println(employeeSalIncrement);
		
		

	}

}
