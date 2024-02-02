package com.karthik;

public class CustomContructor {

	int age;
	CustomContructor (int a){
		age=a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomContructor c=new CustomContructor(2);
		CustomContructor c1=new CustomContructor(5);
		System.out.println(c.age);
		System.out.println(c1.age);
	}

}
