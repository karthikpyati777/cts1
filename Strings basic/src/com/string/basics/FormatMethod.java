package com.string.basics;

public class FormatMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="java";
		System.out.println(str.format("LANGUAGE : %s", str));
		
		//String Format
		
		 String language = "Java";
		    int number = 30;
		    String result;

		    // format object as a string
		    result = String.format("Language: %s", language);

		    System.out.println(result);  // Language: Java

		    // format number as a hexadecimal number
		    result = String.format("Hexadecimal Number: %x", number);  // 1e

		    System.out.println(result); // Hexadecimal Number: 1e
		    
		    
//		    String Formatting of Numbers
		    
		    
		    
		    int n1 = 47;
		    float n2 = 35.864f;
		    double n3 = 44534345.76d;

		    // format as an octal number
		    System.out.println(String.format("n1 in octal: %o", n1));  // 57


		    // format as hexadecimal numbers
		    System.out.println(String.format("n1 in hexadecimal: %x", n1));  // 2f
		    System.out.println(String.format("n1 in hexadecimal: %X", n1));  // 2F

		    // format as strings
		    System.out.println(String.format("n1 as string: %s", n1));  // 47
		    System.out.println(String.format("n2 as string: %s", n2));  // 35.864

		    // format in scientific notation
		    System.out.println(String.format("n3 in scientific notation: %g", n3)); // 4.45343e+07
		  
		  //  String format with multiple format specifiers
		    
		    int n = 47;
		    String text = "Result";

		    System.out.println(String.format("%s\nhexadecimal: %x", text, n));
		    
		    //Formatting of Decimal Numbers
		    

		    float n5 = -452.534f;
		    double n4 = -345.766d;

		    // format floating-point as it is
		    System.out.println(String.format("n1 = %f", n5)); // -452.533997

		    System.out.println(String.format("n2 = %f", n4)); // -345.766000

		    // show up to two decimal places
		    System.out.println(String.format("n1 = %.2f", n5)); // -452.53

		    System.out.println(String.format("n2 = %.2f", n4)); // -345.77
	}

}
