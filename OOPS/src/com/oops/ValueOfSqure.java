package com.oops;
interface Squre{
	int squre(int x);
}
public class ValueOfSqure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Squre s=(y)->(y*y);
System.out.println("value of squre is : "+s.squre(2));

	}
}
