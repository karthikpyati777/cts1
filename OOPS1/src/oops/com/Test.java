package oops.com;

public class Test {
	
	static int age;
	static {
		System.out.println("INITIALIZING TO 21");
		Test.age=21;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Present age of student is :"+age);

	}

	static {
		System.out.println("Intitializing to 22");
		age=22;
	}
}
