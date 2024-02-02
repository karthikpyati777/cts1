package com.java8.advantages;

interface L{
	static void say() {
		System.out.println("Say Hi");
	}
}
public class Static implements L{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static s=new Static();
	  L.say();

	}

	

}
