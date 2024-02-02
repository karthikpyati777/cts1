package java8.com.StaticMethodsInInterface;

interface s{
	public static void sum(int a, int b)
	{
		System.out.println("sum :"+(a+b));
	}
}
public class Stati implements s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      s.sum(1, 2);
	}

}
