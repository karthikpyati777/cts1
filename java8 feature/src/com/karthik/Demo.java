package com.karthik;

public interface Demo {
	
	
	void show();
	default void display()
	
	{
		System.out.println("hello");
	}

}
