package com.oops;

abstract class AbstractEx{
	abstract void display(String name);
	
}
public class AbstractImpl extends AbstractEx  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractImpl a=new AbstractImpl();
		a.display("srinivas");
	}

	@Override
	void display(String name) {
		// TODO Auto-generated method stub
		System.out.println("name of the candidate is :"+name);
	}


}
