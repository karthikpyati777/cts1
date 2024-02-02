package com.java8.advantages;

interface i{
	void say();
}
public class Fni1 implements i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Fni1 f=new Fni1();
//		f.say();
	//  or
		
		i a=new Fni1();
		a.say();
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("say like hello");
	}

}
