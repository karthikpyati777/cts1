package com;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Book> l=new ArrayList();

		Book b1=new Book(1,"agarwal",8);
		Book b2=new Book(2,"parinithi",9);
		l.add(b1);
		l.add(b2);
		for(Book b:l)
		{
			System.out.println(b.id+" "+b.name+" "+b.quantity);
		}
		
	}

}
