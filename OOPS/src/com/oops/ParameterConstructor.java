package com.oops;

public class ParameterConstructor {
	
	int id;
	String name;
	
	

	public ParameterConstructor(int id, String name) {
	
		this.id = id;
		this.name = name;
		
		System.out.println(id +" "+name);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ParameterConstructor p=new  ParameterConstructor(1,"karthik");
		 ParameterConstructor p1=new  ParameterConstructor(2,"pavan");
		 ParameterConstructor p2=new  ParameterConstructor(3,"shilpa");
		 

	}

}
