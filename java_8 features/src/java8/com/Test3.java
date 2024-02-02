package java8.com;

interface intf2{
	public int square(int x);
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
intf2 p=(x)->x*x;
System.out.println(p.square(4));
	}

}
