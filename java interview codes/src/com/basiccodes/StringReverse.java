package com.basiccodes;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1="karthik";
//		StringBuilder s2=new StringBuilder();
//		s2.append(s1);
//		s2=s2.reverse();
//		System.out.println(s2);
		
		//without usingg reverese method
		String str="Pyati";
		char c[]=str.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}
		

	}

}
