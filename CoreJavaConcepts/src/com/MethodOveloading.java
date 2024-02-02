package com;

public class MethodOveloading {

	void m1() {
		System.out.println("HI");
	}
	public static void m2() {
		System.out.println("Hello");
	}
	private void m3() {
		System.out.println("Good");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 MethodOveloading m=new  MethodOveloading();
		 m.m1();
		 m2();
		 m.m3();
	}

}
