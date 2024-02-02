package com.methodRef;

public class MethodReference2 {
	
	public static void say() {
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread tg=new Thread(MethodReference2::say);
		tg.start();
	}

}
