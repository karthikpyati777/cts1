package oops.com;

public class Child extends GrandParent {

	int b=18;
	void show() {
		System.out.println("VIRAT KOHLI");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c=new Child();
		System.out.println(c.x);
		c.say();
//		System.out.println(c.a);
//		c.display();
		System.out.println(c.b);
		c.show();
		
	}

}
