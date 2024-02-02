package com;

abstract class A
{
	abstract public void b();
	
}

public class AbstractionEx extends A {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionEx a=new AbstractionEx();
		a.b();
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("karthik");
	}

}
