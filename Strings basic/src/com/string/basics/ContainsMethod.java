package com.string.basics;

public class ContainsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s="Learn java";
//		System.out.println(s.contains("va"));
//		
//		 String str1 = "Learn Java";
//		    Boolean result;
//
//		    // check if str1 contains "Java"
//		    result = str1.contains("Java");
//		    System.out.println(result);  // true
//
//		    // check if str1 contains "Python"
//		    result = str1.contains("Python");
//		    System.out.println(result);  // false
//
//		    // check if str1 contains ""
//		    result = str1.contains("");
//
//		    System.out.println(result);  // true
//		    
		    
		    //using if-else statement
		    
		    
		    String str1 = "Learn Java";
		    String str2 = "Java";
		    String str3 = "java";
		    Boolean result;
		    
		    // true because "Learn Java" contains "Java"
		    if (str1.contains(str2)) {

		      System.out.println(str1 + " contains " + str2);
		    }
		    else {
		      System.out.println(str1 + " doesn't contains " + str2);
		    }
		    
		    // contains() is case-sensitive
		    // false because "Learn Java" doesn't contains "java"
		    if (str1.contains(str3)) {

		      System.out.println(str1 + " contains " + str3);
		    }
		    else {
		      System.out.println(str1 + " doesn't contain " + str3);
		    }
	}

}
