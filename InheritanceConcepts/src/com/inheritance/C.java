package com.inheritance;

public class C extends B {

	public void say() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c=new C();
		c.display();
		c.show();
		c.say();
	}

}
