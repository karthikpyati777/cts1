package com.karthik;

public class FindingLengthofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s="karthik";
//		System.out.println(s.length());
//		System.out.println(s.toUpperCase());
//		System.out.println(s.toLowerCase());
		
		
//		String s="ABCD";
//		System.out.println("the given string is : "+s);
//		int index=s.charAt(0);
//		System.out.println(index);
//		int index1=s.charAt(2);
//		System.out.println(index1);
//		System.out.println("the character position of 0 is : "+(char)index);
//		System.out.println("the character position of 2 is : "+(char)index1);
//		
//		
//		String s1="pavan";
//		String s2= s1.concat(" pyati");
//		String s3="pavan";
//		System.out.println(s2);
//
//		if(s1.equals(s3))
//		{
//			System.out.println("compared");
//		}
//		else
//			
//		{
//			System.out.println("not compared");
//		}
//		
//		String s4="karthik \"katikan home stay \" ";
//		System.out.println(s4);
//		
//		
//		String example="hello";
//		example=example.concat(" world!");
//		System.out.println(example);
//		
//		
//		String s5=new String("jerry");
//		System.out.println(s5);
		
		
//		String s="ITs Template$789";
//		for(int i=0;i<s.length();i++)
//		{
//			char c=s.charAt(i);
//		if(Character.isUpperCase(c))
//		{
//			System.out.println(c);
//		}
//		else if(Character.isLowerCase(c))
//		{
//			System.out.println(c);
//		}
//		else if(Character.isLetterOrDigit(c))
//		{
//			System.out.print(c);
//		}
//			
//			
//			//System.out.println(c+" "+(int)c);
//		}
		
//		String s="kartJKUk";
//		int count=0, count1=0;
//		for(int i=0;i<s.length();i++)
//		{
//			char c=s.charAt(i);
//			if(Character.isLowerCase(c))
//				count++;
//			if(Character.isUpperCase(c))
//				count1++;
//			
//			
//		}
//		System.out.println(count+ ":lowercase letters are present");
//		System.out.println(count+ ":uppercase letters are present");
		
		
//		
//		String s="karthIk";
//		for(int i=0;i<s.length();i++)
//		{
//			char c=s.charAt(i);
//			if(Character.isUpperCase(c))
//			{
//				System.out.print(c);
//			}
//		
//		String s="KaRtHiK";
//		String sn="";
//		for(int i=0;i<s.length();i++)
//		{
//			char c=s.charAt(i);
//			if(Character.isUpperCase(c))
//			sn=sn+c;
//			
//				
//		}
//		System.out.println(sn);
		
		
//		String s="karthik07pyati";
//		String d="",r="";
//		for(int i=0;i<s.length();i++)
//		{
//			char c=s.charAt(i);
//			if(Character.isDigit(c))
//				d=d+c;
//			else 
//				r=r+c;
//		}
//		String s1=d+r;
//		
//			System.out.println(s1);
		
		
//		String s="KaRtHIk";
//		String s1="",s2="";
//		for(int i=0;i<s.length();i++)
//		{
//			char c=s.charAt(i);
//			if(Character.isUpperCase(c))
//				s1=s1+c;
//			else
//				s2=s2+c;
//		}
//		
//		String s3=s1+s2;
//		System.out.println(s3);
		
//		String s="karthik pyati";
//		String s1=""; 
//		for(int i=0;i<s.length();i++)
//		{
//			char c=s.charAt(i);
//			if(!Character.isWhitespace(c))
//			{
//				s1=s1+c;
//			}
//			
//			
//			
//		}
//		System.out.println(s1);
		
//		
//		String s="pavan26 PYATI";
//		String s1="";
//		for(int i=0;i<s.length();i++) {
//			
//			char c=s.charAt(i);
//			if(Character.isUpperCase(c))
//				s1=s1+Character.toLowerCase(c);
//			else
//				s1=s1+Character.toUpperCase(c);
//		}
//		System.out.println(s1);
//			 
		
		String s="KARTHIK26 PYATI";
		
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			rev=c+rev;
		}
			
         System.out.println(rev);
		
		
		
		
	}

}
