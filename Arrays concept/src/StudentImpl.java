import java.util.ArrayList;
import java.util.List;

public class StudentImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> a=new ArrayList();
		
	Student s=new Student(1,"karthik");
	Student s1=new Student(2,"pyati");
	Student s2=new Student(3,"pavan");
	Student s3=new Student(4,"shilpa");
	a.add(s1);
	a.add(s2);
	a.add(s3);
	System.out.println(a);
	a.forEach(y->System.out.println(y));
	}

}
