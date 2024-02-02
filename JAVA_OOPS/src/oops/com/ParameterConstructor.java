package oops.com;

public class ParameterConstructor {
	
//	public ParameterConstructor(int x, String name) {
//		System.out.println("Number and name of the person is " + x  +  name);
//	}
	
	int x;
	String Name;

	public ParameterConstructor(int x, String name) {
		
		this.x = x;
		Name = name;
		
		System.out.println(" "+ x +" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterConstructor p=new ParameterConstructor(7, "DHONI");
		

	}

}
