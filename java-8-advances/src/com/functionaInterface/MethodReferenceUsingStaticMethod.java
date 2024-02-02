package com.functionaInterface;

interface i2{
	void m1();
}
public class MethodReferenceUsingStaticMethod {

//	public static void saySomething() {
//		System.out.println("this is the static method");
//	}
	public static void ThreadStatus() {
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		i2 i=MethodReference::saySomething;
//		i.m1();

		Thread t =new Thread( MethodReferenceUsingStaticMethod ::ThreadStatus);
		t.run();
	}

}
