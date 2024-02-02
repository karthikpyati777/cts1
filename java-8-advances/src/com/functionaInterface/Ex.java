package com.functionaInterface;

interface intf{
	//void m1();
	//void add(int a,int b);
//	default void squre(int x) {
//		System.out.println("squre of number is : "+(x*x));
//	}
	
	default void m1() {
		System.out.println("default method of intf");
	}
	
}

interface i{
	default void m1() {
	
		System.out.println("default method of i");
	}
}

//class A implements intf{
//
//	@Override
//	public void m1() {
//		// TODO Auto-generated method stub
//		System.out.println("hello");
//	}
	
//}
public class Ex implements intf,i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		intf i=new A();
//		i.m1();
		
//		intf i=()->System.out.println("hello");
//		i.m1();
//		intf i=(a,b)->System.out.println("the sum is : "+(a+b));
//		i.add(1, 2);
//		
//		intf i=(x)->x*x;
//		System.out.println("value of squre of 7 is : "+i.squre(7));
//		Ex e=new Ex();
//		e.squre(7);
//		Ex e=new Ex();
//		e.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		i.super.m1();
	}

}
