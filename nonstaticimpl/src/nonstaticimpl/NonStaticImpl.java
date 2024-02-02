package nonstaticimpl;

public class NonStaticImpl {
	
	private char[] age;

	{
		
		     int age=19;
		     System.out.println(age);
			System.out.println("pavan");
		
       
       
	}
	
	{
		
	     int age=21;
	     System.out.println(age);
	     
		System.out.println("praveen");
	
  
  
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{
			
		     int age=23;
		     System.out.println(age);
			System.out.println("rohith");
		
      
      
	}
		
		NonStaticImpl n=new NonStaticImpl();
	      System.out.println(n.age);

	}

}
