package com.java8.advantages;

interface K{
	int AreaOfRectangle(int l,int b);
}

public class Area implements K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		K a=new Area();
		System.out.println("Area of Rectangle is :"+a.AreaOfRectangle(2, 3));

	}

	@Override
	public int AreaOfRectangle(int l, int b) {
		// TODO Auto-generated method stub
		return l*b;
	}

}
