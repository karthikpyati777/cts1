package comparable_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> s=new ArrayList();
				s.add(new Student(1, "karthik", "pyati", 120));
				s.add(new Student(2, "pavan", "pyati", 140));
				s.add(new Student(3, "shilpa", "pyati", 135));
				
			
				Collections.sort(s);
				for(Student s1:s) {
					System.out.println(s1.id+" "+s1.fName+" "+s1.lName+" "+s1.salry);
				}

	}

}
