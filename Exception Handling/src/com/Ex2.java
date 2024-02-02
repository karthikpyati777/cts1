package com;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int age=10/0;
		}
		catch(Exception e){
			System.out.println("try block handled");
		}
		
		finally{
			System.out.println("rest of code");
		}

	}

}
