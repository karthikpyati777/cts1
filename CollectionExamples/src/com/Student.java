package com;

public class Student {

	int age;
	String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Student s=new Student();
		s.age=18;
		s.name="karthik";
		Student s1=new Student();
		s1.age=21;
		s1.name="DHONI";
		System.out.println(s.age+" "+s.name);
		System.out.println(s1.age+" "+s1.name);
		
	}

}
