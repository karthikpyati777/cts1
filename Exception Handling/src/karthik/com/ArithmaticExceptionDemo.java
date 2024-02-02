package karthik.com;

import java.io.IOException;
import java.io.InvalidClassException;

public class ArithmaticExceptionDemo {
int[] a=new int[10];
public static void findAll() throws NullPointerException,IOException,InvalidClassException{
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		try {
//			int a=10/0;
//		}
//		catch(Exception e)
//		{
//			System.out.println("exception are occured is handled");
//		}
//		
//		System.out.println("completed");
		
//		int[] a=new int[10];
//		a[15]=43;
//		System.out.println(a[15]);
//		
//		String s=null;
//		System.out.println(s.length());
//		
//        String s="abc";
//        int a=Integer.parseInt(s);
//        System.out.println(a);
		try {
			findAll();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
