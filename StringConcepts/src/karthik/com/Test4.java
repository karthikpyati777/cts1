package karthik.com;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String a="Amma";
//		String b="Appa";
//				
//		String x=a.toLowerCase();
//		String z=b.toLowerCase();
//		System.out.println(x);
//		System.out.println(z);
//		
//		char[] c=x.toCharArray();
//		char[] d=z.toCharArray();
//		System.out.println(c);
//		System.out.println(d);
//		
//		Arrays.sort(c);
//		Arrays.sort(d);
		
		 String str1="Amma";  
	        String str2="AMMA";  
	  
	        //Converting both the string to lower case.  
	        str1 = str1.toLowerCase();  
	        str2 = str2.toLowerCase();  
	  
	        //Checking for the length of strings  
	        if (str1.length() != str2.length()) {  
	            System.out.println("Both the strings are not anagram");  
	        }  
	        else {  
	            //Converting both the arrays to character array  
	            char[] string1 = str1.toCharArray();  
	            char[] string2 = str2.toCharArray();  
	  
	            //Sorting the arrays using in-built function sort ()  
	            Arrays.sort(string1);  
	            Arrays.sort(string2);  
	  
	            //Comparing both the arrays using in-built function equals ()  
	            if(Arrays.equals(string1, string2) == true) {  
	                System.out.println("Both the strings are anagram");  
	            }  
	            else {  
	                System.out.println("Both the strings are not anagram");  
	            }  
	        }  
	    }  
	   
	}

