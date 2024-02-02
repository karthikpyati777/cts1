package java8.com;

interface K{
	default void me() {
		System.out.println("my name is karthik");
	}
}

public class Default2 implements K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Default2  d=new Default2 ();
		d.me();
	}

}
