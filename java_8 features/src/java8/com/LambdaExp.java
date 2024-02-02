package java8.com;

interface A{
	void m1();
}

public  class LambdaExp implements A {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new LambdaExp() ;
		a.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

}
