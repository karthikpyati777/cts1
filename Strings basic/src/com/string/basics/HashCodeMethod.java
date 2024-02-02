package com.string.basics;

public class HashCodeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    String str1 = "Java";
		    String str2 = "Java Programming";
		    String str3 = "";
		    String str4="java";
		    String str5 = "Java Programming";
		    

		    System.out.println(str1.hashCode()); // 2301506
		    System.out.println(str2.hashCode()); // 1377009627
 
		    System.out.println(str4.hashCode());
		    
		    System.out.println(str5.hashCode());
		    // hash code of empty string is 0
		    System.out.println(str3.hashCode()); // 0
	}

}
