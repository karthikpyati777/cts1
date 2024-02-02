package com;

public class throwpgm {
	public static void divideByzeo()
	{
		//throw keyword is used to explicit throw a single Exception
		
		//throw an exception
		throw new ArithmeticException("divide by zero");
	}
	
	public static void main(String[] args) {
		divideByzeo();
	}

}
