package com;

public class trycatchprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		int a=5/0;
	}catch(ArithmeticException e)
{
		System.out.println("arithmatic exception occured :" +e.getMessage());
}
finally {
	System.out.println("this is finally block");
}
	}
}
