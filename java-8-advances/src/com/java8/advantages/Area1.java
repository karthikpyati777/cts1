package com.java8.advantages;


interface V{
	int areaOfRectangle(int a,int b);
}
public class Area1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V v=(a,b)->a*b;
		System.out.println("Area of Rectangle is :"+v.areaOfRectangle(2, 3));

//	System.out.println(v.areaOfRectangle(2, 3));	
	}

}
