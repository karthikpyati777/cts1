package com.string.basics;

public class StartsWithMethod {

    public static void main(String[] args) {
    	String s="Learn java";
    	System.out.println(s.startsWith(s));
    	System.out.println(s.startsWith("srn"));
    	System.out.println(s.startsWith("La", 5));
    	System.out.println(s.startsWith("Le"));
    	
    	
    	//startsWith() without offset parameter
    	
    	
    	String str = "Java Programming";

        System.out.println(str.startsWith("Java")); // true
        System.out.println(str.startsWith("J")); // true
        System.out.println(str.startsWith("Java Program")); // true


        System.out.println(str.startsWith("java")); // false

        System.out.println(str.startsWith("ava")); // false
        
        
      //startsWith() with offset parameter
        System.out.println(str.startsWith("Programming", 0));
        System.out.println(str.startsWith("Programming", 5));
        
        

        String str5 = "Java Programming";

        // checks in substring "a Programming"
        System.out.println(str5.startsWith("Java", 3)); // false
        System.out.println(str5.startsWith("a Pr", 3)); // true
    }
}
