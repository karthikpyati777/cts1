package com;

public class TestVote {

	
	public static void validate(int age)
	{
		if(age<18)
			throw new ArithmeticException("not valid to vote");
		else
			System.out.println("valid to vote");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		validate(19);
		System.out.println("rest of code...");

	}

}
