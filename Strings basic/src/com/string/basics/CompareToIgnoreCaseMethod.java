package com.string.basics;

public class CompareToIgnoreCaseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str1 = "Learn Java";
//        String str2 = "learn java";
//        String str3 = "Learn Kolin";
//        int result;
//
//        // comparing str1 with str2
//        result = str1.compareToIgnoreCase(str2);
//        System.out.println(result); // 0
//
//        // comparing str1 with str3
//        result = str1.compareToIgnoreCase(str3);
//        System.out.println(result); // -1
//
//        // comparing str3 with str1
//        result = str3.compareToIgnoreCase(str1);
//        System.out.println(result); // 
		
		
		
		 String str1 = "LEARN JAVA";
	        String str2 = "Learn Java";
	        
	        // if str1 and str2 are equal (ignoring case differences),
	        // the result is 0
	        if (str1.compareToIgnoreCase(str2) == 0) {
	            System.out.println("str1 and str2 are equal");
	        }
	        else {
	            System.out.println("str1 and str2 are not equal");
	        }

	}

}
