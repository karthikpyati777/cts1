package com.inheritance;

public class B extends A {

	public void display() {
		System.out.println("mahananda from bidar");
	}
	
	public static void main(String args[]) {
		B b=new B();
		b.show();
		b.display();
	}
}
