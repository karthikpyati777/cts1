package com;

public class Demo {

//	static void find(int a) {
//		
//		if(a%2==0)
//			System.out.println("even");
//		else
//			System.out.println("odd");
//	}
	
//	static String positiveOrNegative(int n) {
//		if(n>0)
//			return n+" positive number";
//		else
//			return n+" negative number";
//	}
	static void display(String name,String subject) {
		System.out.println(name +" is studying "+ subject);
	}
	static String display(String name,int age) {
		return name + age + "years old";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // find(3);
		//System.out.println(positiveOrNegative(1));
		
		display("karthik","java");
		System.out.println(display("prabhu",19));
		
	}

}
