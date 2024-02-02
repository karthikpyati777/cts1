package com.functionaInterface;

interface say{
	void say();
}
public class MethodReferenceUsingNonStaticMethod {

	public void sayAnything() {
		System.out.println("this is non static method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		MethodReferenceUsingNonStaticMethod m=new MethodReferenceUsingNonStaticMethod ();
//		say s=m::sayAnything; 
//		s.say();
		
		//using anonymous objecct
		
		say s=new MethodReferenceUsingNonStaticMethod()::sayAnything;
		s.say();
	}

}
