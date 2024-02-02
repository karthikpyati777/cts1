package threadEx;

public class Demo implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		Thread t=new Thread(d);
		t.start();
		System.out.println("working fine!!!!!");

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("working");
	}

}
