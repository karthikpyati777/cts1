package com;

interface P{

	void hello();
	
} 
public class S implements P{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      P p=new S();
       p.hello();
	}

	public void hello() {
		System.out.println("karthik");
	}
}
