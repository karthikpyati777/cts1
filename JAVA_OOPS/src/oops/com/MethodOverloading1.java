package oops.com;

public class MethodOverloading1 {
	
	public static int display(int a) {
		return a*a*a;
	}
	
	public static int display (int a, String s) {
		return a+'s';
	}
	
	public static String display(String s) {
		return s;
	}

	public static double display(double a) {
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(display(7, "DHONI"));
	
		System.out.println(display(78.90));
		
		System.out.println(display("RAHUL"));
		
		System.out.println(display(7));
		

	}

}
