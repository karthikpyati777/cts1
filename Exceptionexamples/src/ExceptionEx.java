
public class ExceptionEx extends Thread {
  public void run()
  {
	  System.out.println("hello");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionEx thread=new ExceptionEx ();
		thread.start();
		System.out.println(thread);
		

	}

}
