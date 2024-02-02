package com.string.basics;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		String s="Karthi Pyati Is working in Cognizant";
//		
//		String[] s1=s.split("",19);
//		
//		System.out.println(Arrays.toString(s1));
		
		String text = "Java is a fun programming language";

	    // split string from space
	    String[] result = text.split(" ");
	    System.out.println(result);
	    System.out.print("result = ");
	    for (String str : result) {
	      System.out.print(str + ", ");
	    }

	}

}
