package com;

public class DefaulutEx {

	public static void dostuff(){
		 doMoreStuff();
//		 System.out.println(10/0);
		 System.out.println("hi");
	}
public static void doMoreStuff() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dostuff();
		System.out.println(10/0);
	}

}
