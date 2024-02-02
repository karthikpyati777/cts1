package oops.com;

abstract class A{
	
	abstract void display();
}


public class AbstractionEx extends A{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionEx d=new AbstractionEx();
		d.display();

	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("HEllo");
	}

}
