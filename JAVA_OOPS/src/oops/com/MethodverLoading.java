package oops.com;

public class MethodverLoading {

	public void m1() {
		System.out.println("this is m1 method");
		
	}
	
	public void m1(int a) {
		System.out.println("square of value of a is : "+a*a);
	}
	
	public void m1(int a,int b) {
		System.out.println("sum of value of a and value of b is : "+(a+b) );
	}
	
	public void m1(String s) {
		System.out.println("name is : "+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodverLoading m=new MethodverLoading();
       m.m1();
     m.m1(7);
     m.m1(5, 2);
     m.m1("karthik");

	}

}
