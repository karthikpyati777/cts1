package defaultMethods.com;

interface k
{
	default void disp()
	{
		System.out.println("hi");
	}
}
interface j
{
	default void disp()
	{
		System.out.println("hi");
	}
}
public class Show implements k,j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Show s=new Show();
		s.disp();
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("say hello");
		
	}

}
