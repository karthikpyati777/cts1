package com.string.basics;

import java.util.ArrayList;

public class JoinMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="I";
		String s2="Love";
		String s3="Cognizant";
		
		String res=String.join(" ", s1,s2,s3);
		System.out.println(res);
	    
		
		 ArrayList<String> text = new ArrayList<>();

		    // adding elements to the arraylist
		    text.add("Java");
		    text.add("is");
		    text.add("fun");

		    String result;

		    result = String.join("-", text);

		    System.out.println(result);  // Java-is-fun

	}

}
