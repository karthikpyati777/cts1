package com;

public class MethodOverloading {

	
	static void display(int a) {
		System.out.println("the integer number is :" +a);
	}
	static void display(int a,String s) {
		System.out.println(a + "is" + s);
	}
	
	public void display(String s,int a) {
		System.out.println(s+ "is" + a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(7);
		display(8,"karthik");
		MethodOverloading m=new MethodOverloading();
		m.display("bhuvan",10);
		

	}

}