
public class Employee {
    
	
	int age;
	
	Employee(int age)
	{
		this.age=age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee e1=new Employee(21);
      Employee e2=new Employee(25);
      
      Employee[] e= {e1,e2};
      for(int i=0;i<e.length;i++)
      {
    	  System.out.println("Age :"+e[i].age);
      }
	}
      
}
