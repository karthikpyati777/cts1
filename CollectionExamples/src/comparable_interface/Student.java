package comparable_interface;

public class Student implements Comparable<Student> {
	
	 int id;
	 String fName;
	 String lName;
	 int salry;
	public Student(int id, String fName, String lName, int salry) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.salry = salry;
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		if(salry==s.salry) {
			return 0;
		}
		else if(salry>s.salry) {
			return 1;
		}
		else {
		return -1;
		
	}
	
	 
	}
}
