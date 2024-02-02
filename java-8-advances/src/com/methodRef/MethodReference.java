package com.methodRef;

interface i{
	void say();
}
public class MethodReference {
	
	public static void display() {
		System.out.println("Hi karthik");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		i s=MethodReference::display;
	        s.say();

	}

}
