package com;

public class MethodOverloading1 {

	public String m1(String str) {
		return str; 
	}
	
	public int m1(int a,int b) {
		
		return a+b;
	}
	
	public boolean m1(boolean isIt) {
		return isIt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading1 m=new MethodOverloading1();
		System.out.println(m.m1("karthik"));
		System.out.println(m.m1(1, 2));
	    System.out.println(m.m1(true));
	}

}
