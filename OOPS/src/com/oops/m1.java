package com.oops;

interface intf{
	void m2();
}
public class m1 implements intf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     intf f=new m1();
     f.m2();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("hi karthik");
	}

}
