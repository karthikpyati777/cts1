package threadEx;

public class Test extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test thread=new Test();
		thread.stop();
		System.out.println("outside working");
	}

	public void run()
	{
		System.out.println("hello");
	}
}
