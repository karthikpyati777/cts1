package staticMethods.com;

interface intf
{
	public static void sum(int a,int b) {
		System.out.println("the sum : " +(a+b));
	}
}
public class Test implements intf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       Test t=new Test();
		intf.sum(1, 2);
       
	}

}
