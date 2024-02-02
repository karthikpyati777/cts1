package basicsofjava.com;

import java.util.Scanner;

public class PalindromeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s="karthik";
//		String rev=" ";
//		char c[]=s.toCharArray();
//		for(int i=c.length-1;i>=0;i--) {
//			
//			rev=rev+c[i];
//			
//		
//		System.out.println(rev);
//		
//		if(rev.equals(s)) {
//			System.out.println("yes");
//		}
//
//		else
//			System.out.println("No");
//	}
		String sname,rev="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		sname=s.nextLine();
		int len=sname.length();
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+sname.charAt(i);
		}
		System.out.println(rev);
		
		if(sname.equals(rev))
			System.out.println("PALINDROME");
		else
			System.out.println("NOT PALINDROME");
	}
}
