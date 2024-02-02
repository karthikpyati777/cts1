package com;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=0;
//		int b=1;
//		int c=1;
//		for(int i=1;i<=5;i++) {
//			
//			a=b;
//			b=c;
//			c=a+b;
//			System.out.println(c + "");
//		}
//		

		int n1=0,n2=1,n3,count=10;
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=2;i<count;++i) {
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
		}
		
	}

}
