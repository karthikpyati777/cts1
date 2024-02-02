package org;

public class Student implements Comparable<Student> {

	int rollno;
	String name;
	int age;
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		if(age==s.age)
		return 0;
		else if(age>s.age)
			return 1;
		else
			return -1;
	}

}
