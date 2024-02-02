package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	 int id;
	 String name;
	 int price;
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	 
	 
}

public class FilterDemo4 {

	public static void main(String[] args) {
		
		List<Product> p=new ArrayList();
		p.add(new Product(1, "sumsung", 2000));
		p.add(new Product(2, "Vivo", 3000));
		p.add(new Product(3, "nokia", 1500));
		
//		List<Product> s=new ArrayList();
//	   p.stream().filter(b->b.price>1500).collect(Collectors.toList()
//			   .forEach(pr->System.out.println(pr.price)));
//	   System.out.println(s);
		
		p.stream().filter(s->s.price>1600)
		                     .forEach(pr->System.out.println(pr.price));
		
	}

}
