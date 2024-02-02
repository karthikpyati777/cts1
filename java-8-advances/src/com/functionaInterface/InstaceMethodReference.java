package com.functionaInterface;

import java.util.function.BiFunction;

class Arithmatic{
	 public int add(int a,int b) {
		 return a+b;
	 }
 }
public class InstaceMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiFunction<Integer, Integer, Integer> adder=new Arithmatic()::add;
		int result=adder.apply(1, 2);
		System.out.println(result);
	}

}
