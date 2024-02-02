package com.java8.advantages;


interface intf{
	void m1();
}

public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intf i=()->System.out.println("HELLO COGNIZANT");
		i.m1();

	}

}
