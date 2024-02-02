package basicsofjava.com;

interface F{
	static void m1() {
		System.out.println("methos is defined");
	}
}
public class Static implements F {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		F.m1();
	
	}

}
