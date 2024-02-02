package defaultmethods.com;

interface i1{
	default void m1()
	{
		System.out.println("m1 method");
	}
	
}
interface i2 {
	
	default void m1()
	{
		System.out.println("m1 method");
	}
}
public class Test implements i1,i2 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
     
	 public void m1()
	 {
		 System.out.println("test class method");
	 }
	 
	 public static void main(String[] args) {
		Test t=new Test();
		t.m1();
	}
}
