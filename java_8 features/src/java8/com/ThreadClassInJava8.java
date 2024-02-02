package java8.com;

public class ThreadClassInJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("child Thread");
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
	
	}

}
