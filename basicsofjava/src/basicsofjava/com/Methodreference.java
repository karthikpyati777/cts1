package basicsofjava.com;

interface Interf{
	void m1();
}
public class Methodreference {

	static void m2() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interf i=Methodreference::m2;
		i.m1();
	}

}
