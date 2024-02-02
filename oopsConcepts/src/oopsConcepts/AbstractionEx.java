package oopsConcepts;

abstract class helloWorld{
	abstract void display();
}


public class AbstractionEx extends helloWorld{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionEx  a=new AbstractionEx ();
		a.display();
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	}

}
