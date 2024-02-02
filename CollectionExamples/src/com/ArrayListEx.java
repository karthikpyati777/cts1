package com;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Employee> e=new ArrayList();
		
		Employee e1=new Employee("karthik",20000,"gangavathi");
		Employee e2=new Employee("raghu",80000,"bangalore");
		Employee e3=new Employee("shilpa",60000,"tumkur");
		e.add(e1);
		e.add(e2);
		e.add(e3);
		for(Employee e4:e)
		{
			System.out.println(e4.name+" : "+e4.salry+" : "+e4.loc);
		}
		
		
	}

}
