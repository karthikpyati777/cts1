package lamdaFunctions;

interface y{
	void display();
}
class a implements y {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      y x=new a();
      x.display();
      }

}
