package com.karthik.tostoreobjintoarray;

public class Student {

	int age;
	Student(int age){
		this.age=age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student(18);
		Student s2=new Student(21);
		Student[] s= {s1,s2};
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i].age);
		}
	}

}
