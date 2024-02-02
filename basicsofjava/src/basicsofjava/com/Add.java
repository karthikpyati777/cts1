package basicsofjava.com;

interface Addition{
	void addOfTwoNumbers(int a,int b);
}
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Addition x=(a,b)->System.out.println("value is : "+(a+b));
		 x.addOfTwoNumbers(1, 02);
	}

}
