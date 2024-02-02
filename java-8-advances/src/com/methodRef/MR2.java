package com.methodRef;

interface K{
	public void m1();
}

public class MR2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		K k=MR2::f;
		k.m1();

	}
	
	public static void f() {
		System.out.println("KARTHIK");
	}

}
