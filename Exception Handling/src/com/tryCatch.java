package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class tryCatch {

	//public static void divideByZero() {

//	    // throw an exception
//	    throw new ArithmeticException("Trying to divide by 0");
//	  }
	// declareing the type of exception
	  public static void findFile() throws IOException {

	    // code that may generate IOException
	    File newFile = new File("test.txt");
	    FileInputStream stream = new FileInputStream(newFile);
	  }
public  static void main(String[] args) {
		// TODO Auto-generated method stub
	//divideByZero();
		try {
			findFile();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		
//		try
//		{
//			int []a=new int[5];
//			a[3]=10/0;
//			
//			System.out.println("first print statement in try block");
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("warning:ArithmeticException");
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("warning: ArrayIndexOutOfBoundsException");
//		}catch(Exception e)
//		{
//			System.out.println("warning: some other exception");
//		}
//		System.out.println("out of try-catch block");
		
//		String s="karthik";
//		int a=Integer.parseInt(s);
		//System.out.println(s.length());
		try {
			
//			int a=6/0;
//			int[] a=new int[3];
//			a[5]=10;
//			String s=null;
//			System.out.println(s.length());
//			System.out.println("rest of the code");
		} catch (Exception e) {
			// TODO: handle exception
//			System.out.printf("6/0 is not divided => "+e.getMessage());
//			System.out.println(e.getMessage());
		}
		
//		 try {
//		      // code that generates exception
//		      int divideByZero = 5 / 1;
//		      System.out.println("5 is divisible by 1");
//		    }
//
//		    catch (ArithmeticException e) {
//		      System.out.println("ArithmeticException => " + e.getMessage());
//		    }
//		    
//		    finally {
//		      System.out.println("This is the finally block");
//		    }
	}

}
