package springDemo.com;

public class Employee {
	
	int id;
	String name;
	double salry;
	
	public Employee() {
		
	}

	public Employee(int id, String name, double salry) {
	
		this.id = id;
		this.name = name;
		this.salry = salry;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalry() {
		return salry;
	}

	public void setSalry(double salry) {
		this.salry = salry;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salry=" + salry + "]";
	}

	
	
}
