package basicsofjava.com;

interface Hello{
	void say();
}
public class Hi  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h=()->System.out.println("HI KARTHIK");
		h.say();
	}

}
