package com.java8.advantages;

interface Default{
	default void m1() {
		System.out.println("GOOD MORNING COGNIZANT");
	}
}
public class DefaultMethod implements Default {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		DefaultMethod d=new DefaultMethod();
		d.m1();
	}

}
