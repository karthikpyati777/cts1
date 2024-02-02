package com;

public class Mobile {

	String brand="SAMSUNG";
	int cost=30000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1=new Mobile();
		Mobile m2=new Mobile();
		System.out.println(m1.brand+" "+m1.cost);
		System.out.println(m2.brand+" "+m2.cost);
		m1.brand="VIVO";
		m1.cost=21000;
		System.out.println(m1.brand+" "+m1.cost);
		System.out.println(m2.brand+" "+m2.cost);
		
		

	}

}
