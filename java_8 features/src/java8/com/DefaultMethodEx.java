package java8.com;

interface a{
	default void m1() {
		System.out.println("I LOVE COGNIZANT");
	}
	
	void say(String msg);
}

public class DefaultMethodEx implements a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultMethodEx d=new DefaultMethodEx();
		d.say("i am working on core java project");
		d.m1();
		
	}

	@Override
	public void say(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

}
