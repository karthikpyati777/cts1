package com.java8.advantages;

interface D{
	public int squre(int x);
}
public class SqureOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		D z=x->x*x;
		System.out.println("Squre of number is :"+z.squre(3));
	}

}
