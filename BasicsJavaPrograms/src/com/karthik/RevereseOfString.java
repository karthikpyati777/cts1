package com.karthik;

public class RevereseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s="KARTHIK";
//		String rev="";
//		int len=s.length();
//		System.out.println(len);
//		for(int i=0;i<s.length();i++)
//		{
//			char c=s.charAt(i);
//			rev=c+rev;
//		}
//		
//		System.out.println("reverse of string is : "+rev);
		
		
//		for(int i=len-1;i>=0;i--) {
//			rev=rev+s.charAt(i);
//		}
		
		
//		String s="Pyati";
//		String rev="";
//		char a[]=s.toCharArray();
//		int l=a.length;
//		for(int i=l-1;i>=0;i--)
//		{
//			rev=rev+a[i];
//		}
////	
		String s="PAVAN";
		StringBuffer sb=new StringBuffer(s);
		StringBuffer rev=sb.reverse();
	System.out.println("reverese of string is : "+rev);
		

	}

}
