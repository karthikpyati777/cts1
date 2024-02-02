package com;

public class MethodOverloadingEx {

	public String hi(String str) {
		return toString();
	}
	public int hi(int a) {
		return hashCode();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingEx m=new MethodOverloadingEx();
		System.out.println(m.hi("kartijk"));
		System.out.println(m.hi(8));
		
	}

}
