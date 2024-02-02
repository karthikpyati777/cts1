package basicsofjava.com;

interface A{
	default void display() {
		System.out.println("show something");
	}
}
public class Default implements A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A a=new  Default();
       a.display();
	}
}
