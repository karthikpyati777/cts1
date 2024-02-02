package com.karthik;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        String s="karthik";
//        System.out.println(s.substring(2,5));
		
		String s="karthik";
		char a[]=s.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
	}

}
