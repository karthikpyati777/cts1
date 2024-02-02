package com.java8.advantages;

interface T{
	default void m1() {
		System.out.println("m1 method");
	}
}
	interface N{
		default void m1() {
			System.out.println("m1 method again");
		}
	}

public class AmbiguityOfDefault implements T ,N{

	@Override
	public void m1() {
		System.out.println("m1 method tested");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AmbiguityOfDefault a=new AmbiguityOfDefault();
		a.m1();
		
	}

}
