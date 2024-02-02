package inheritance;

public class C extends A {

	
	int d=10;
	
	public void hello()
	{
		System.out.println("karthik");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C f=new C();
		B g=new B();
		g.display();
		System.out.println(g.a+" "+g.b);
		f.display();
		
		
		System.out.println(f.a+" "+f.d);

	}

}
