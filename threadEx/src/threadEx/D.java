package threadEx;

public class D extends Thread {

	public static int amount=0;
	public void run()
	{
		amount++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       D d=new D();
       d.start();
       while(d.isAlive())
       {
    	   System.out.println("waiting...");
       }
       
       System.out.println("main :"+amount);
       amount++;
       System.out.println("main :"+amount);
	}
	
	

}
