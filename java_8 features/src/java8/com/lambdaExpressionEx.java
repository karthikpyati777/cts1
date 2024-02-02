package java8.com;

interface interf{
	public void m1();
	
}
class Demo implements interf{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
	}
	
}
public class lambdaExpressionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		interf d=new Demo();
		d.m1();
		
	}

}
