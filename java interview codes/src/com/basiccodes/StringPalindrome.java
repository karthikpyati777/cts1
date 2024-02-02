package com.basiccodes;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Ammaji";
		String strRev="";
		int strLength=str.length();
		
		for(int i=(strLength-1);i>=0;--i)
		{
			strRev=strRev+str.charAt(i);
		}
		if(str.toLowerCase().equals(strRev.toLowerCase()))
		{
			System.out.println("palindrome");
		}

		else
		{
			System.out.println("notpalindrome");
		}
	}

}
