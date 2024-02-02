package com.cognizant;

public class ToStringExample {

	int age;
	ToStringExample(int age){
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "ToStringExample [age=" + age + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringExample s=new ToStringExample(18);
		System.out.println(s);

	}

}
