package java8.com;

import java.util.Iterator;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}
	}
	
}
public class ThreadClassExample {

	public static void main(String[] args) {
		
		Runnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}
}
