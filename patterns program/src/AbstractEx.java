  abstract class parent{
	  abstract void display();
  }
public class AbstractEx extends parent {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractEx a=new AbstractEx();
		a.display();
		

	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("father");
		
	}

}
