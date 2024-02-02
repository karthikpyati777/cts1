package com.oops;

interface Add{
	void add(int a,int b);
}
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Add a1=(a,b)->System.out.println("Addition of two numbers : "+(a+b));
 a1.add(1, 2);
	}

}
