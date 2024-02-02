package abstractionExample;


abstract class a
{
	abstract void display();
}
public class AbstractionEx extends a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionEx ab=new AbstractionEx();
		ab.display();

	}

	@Override
	void display() {
		// TODO Auto-generated method stub
	System.out.println("karrthik");	
	}

}
