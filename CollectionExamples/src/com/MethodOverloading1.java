package com;

public class MethodOverloading1 {

	public static void main(int a) {
		System.out.println(a);
	}
	
	public static void main(double  a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("start");
main(10);
main(10898);
System.out.println("end");
	}

}
