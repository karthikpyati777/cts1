package com.java8.advantages;

interface sum{
	void sumOfNumber(int a,int b);
}
public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum s=(a,b)->System.out.println("sum of the number is "+(a+b));
		s.sumOfNumber(1, 2);
	}

}
