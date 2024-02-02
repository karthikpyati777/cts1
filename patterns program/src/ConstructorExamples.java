
public class ConstructorExamples {
	
//	ConstructorExamples(){
//		System.out.println("hi");
//	}
	ConstructorExamples(int id)
	{
		System.out.println("id : " + id);
	}
	public static void main(String[] args)
	{
		new ConstructorExamples(25);
	}

}
