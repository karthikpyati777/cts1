package oops.com;

public class Y extends X {

	public void display() {
		super.display();
		System.out.println("OLD FATHER BIKE MODIFIED BY SON ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Y y=new Y();
		
		y.display();
		
	}

}
