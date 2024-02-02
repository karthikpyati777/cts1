package defaultMethods.com;

interface i
{
	default void displ()
	{
		System.out.println("i");
	}
}
interface t
{
	default void displ()
	{
		System.out.println("j");
	}
}
public class Test implements i,t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t=new Test();
t.displ();
	}

	@Override
	public void displ() {                  
		// TODO Auto-generated method stub
		i.super.displ();
	}

}
