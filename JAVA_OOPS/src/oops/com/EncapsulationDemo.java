package oops.com;

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		
		Students s=new Students();
		s.setId(7);
		s.setName("Rakshith");
		s.setBranch("CSE");
//		
//		System.out.println(s.getId());
//		System.out.println(s.getName());
//		System.out.println(s.getBranch());
		
		System.out.println(" "+s.getId()+" "+s.getName()+" "+s.getBranch());
		
	}
	
	
}
