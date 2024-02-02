package oopsConcepts;

public class PolymorphismEx {

	
	public PolymorphismEx(int i) {
		// TODO Auto-generated constructor stub
	}
	public PolymorphismEx(String string, int i) {
		// TODO Auto-generated constructor stub
	}
	public PolymorphismEx() {
		// TODO Auto-generated constructor stub
	}
	public void display(int id)
	{
		System.out.println(id);
	}
	public void display(String name,int id)
	{
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismEx p=new PolymorphismEx();
		p.display(1);
		p.display("karthik", 2);
		

	}

}
