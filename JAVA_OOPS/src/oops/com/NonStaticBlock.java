package oops.com;

public class NonStaticBlock {

	{
		int a=7;
		System.out.println(" i am a MS DHONI");
	}
	{
		int b=18;
		System.out.println("I am virat Kohli");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStaticBlock n=new NonStaticBlock();
		System.out.println("HELLO NON STATIC BLOCK");
	}

}
