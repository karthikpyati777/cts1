
interface t1{
	default void m1()
	{
		System.out.println("default method");
	}
}
 class Demo implements t1
{
	
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       t1 t=new Demo();
       t.m1();
       
	}

}
