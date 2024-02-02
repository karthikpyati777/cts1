package com.java8.advantages;

interface A{
	void sum(int x,int y);
}
public class B implements A {

	@Override
	public void sum(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("sum of the number :"+(x+y));
	}

}
