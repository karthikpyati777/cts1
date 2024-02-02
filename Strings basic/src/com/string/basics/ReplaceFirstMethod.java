package com.string.basics;

public class ReplaceFirstMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str1 = "aabbaaac";
	      String str2 = "Learn223Java55@";

	      // regex for sequence of digits
	      String regex = "\\d+";

	      // the first occurrence of "aa" is replaced with "zz"
	      System.out.println(str1.replaceFirst("aa", "zz")); // zzbbaaac
	      
	      System.out.println(str1.replaceFirst("aaa", "z")); // zzbbzc

	      // replace the first sequence of digits with a whitespace
	      System.out.println(str2.replaceFirst(regex, " ")); // Learn Java55@
	      
	      
	      String str = "a+a-++b";

	      // replace the first "+" with "#"
	      System.out.println(str.replaceFirst("\\+", "#")); // a#a-++b
	}

}
