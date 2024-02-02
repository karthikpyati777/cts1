package com;


public class TestExcception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
			throw new CustomException("invalid exception");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
