package com;

import java.util.StringTokenizer;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="My Name Is Cognizant";
		StringTokenizer st=new StringTokenizer(s);
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken());
		}

	}

}
