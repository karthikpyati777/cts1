package com;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="MY Name Is Karthik";
		String sw=s.toLowerCase();
		System.out.println(sw);
		char[] ch=sw.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				System.out.println("vowel found at :"+" " +ch[i]);
			}
		}
	}

}
