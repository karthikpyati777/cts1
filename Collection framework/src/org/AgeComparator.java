package org;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

	//@Override
//	public int compare(Student s1, Student s2) {
//		// TODO Auto-generated method stub
//		if(s1.age==s2.age)
//		return 0;
//		if(s1.age>s2.age)
//			return 1;
//		else
//			return -1;
//	}

	@Override
	public int compare(Employee s1, Employee s2) {
		// TODO Auto-generated method stub
		if(s1.age==s2.age)
			return 0;
			if(s1.age>s2.age)
				return 1;
			else
				return -1;
	}

}
