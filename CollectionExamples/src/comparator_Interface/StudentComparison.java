package comparator_Interface;

import java.util.ArrayList;
import java.util.Collections;

public class StudentComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Student> l=new ArrayList<>();
      
      l.add(new Student(1, "karthik", 7));
      l.add(new Student(4, "pavan", 6));
      Collections.sort(l, new AgeComparator());
      
      for(Student s:l) {
    	  System.out.println(s.rollno+" "+s.name+" "+s.age);
      }
	}

}
