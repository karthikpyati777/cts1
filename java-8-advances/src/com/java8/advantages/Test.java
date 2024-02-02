package com.java8.advantages;

interface Left{
	default void m1() {
		System.out.println("Left default method");
	}
}
interface Right{
	default void m1() {
		System.out.println("Right default method");
	}
}
public class Test implements Left,Right {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
	 
		t.m1();

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Right.super.m1();
	}

}
