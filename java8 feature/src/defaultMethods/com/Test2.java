package defaultMethods.com;

interface A
{
	default void m1()
	{
		System.out.println("right");
	}
	
}
interface B
{
	default void m1()
	{
		System.out.println("left");
	}
}
public class Test2 implements A,B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Test2 t=new Test2();
  t.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		A.super.m1();
	}

}
