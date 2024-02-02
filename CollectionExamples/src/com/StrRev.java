package com;

public class StrRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="karthik";
		char ch;
		String revStr="";
		int strlen=s.length();
		
		System.out.println("original string is :" +s);
		
		for(int i=0;i<strlen;i++) {
			ch=s.charAt(i);
			revStr=ch+revStr;
		}
		
		System.out.println("revere string is :" +revStr);

	}

}
