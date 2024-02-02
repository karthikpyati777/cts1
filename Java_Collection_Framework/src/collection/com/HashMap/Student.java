package collection.com.HashMap;

public class Student {

	private String firstname;
	private String lastName;
	public Student(String firstname, String lastName) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", lastName=" + lastName + "]";
	}
	
	
	
}
