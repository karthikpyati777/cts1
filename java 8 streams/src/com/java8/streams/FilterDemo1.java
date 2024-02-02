package com.java8.streams;

import java.util.ArrayList;
import java.util.List;

class ProductList{
	int id;
	String name;
	double salary;

	public ProductList(int id, String name, double salary) {
	//	super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
}
public class FilterDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ProductList> l= new ArrayList<ProductList>();
		l.add(new ProductList(1, "adidas", 23000));
		l.add(new ProductList(2, "reebok", 18000));
		l.add(new ProductList(3, "ceat", 21000));
		l.add(new ProductList(4, "mangose", 17000));
		
	
		
		l.stream().filter(p->p.salary>20000).forEach(pr->System.out.println(pr.salary));
		
		
		
		

	}

}