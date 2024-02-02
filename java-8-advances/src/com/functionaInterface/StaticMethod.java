package com.functionaInterface;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//interface i1{
//	static void sum(int a, int b) {
//		System.out.println("ADD : "+ (a+b));
//	}
//}
public class StaticMethod  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	StaticMethod s=new StaticMethod();
		
	//	i1.sum(1, 4);
		
		Predicate<Integer> p=i->i>10;
		System.out.println(p.test(9));
		System.out.println(p.test(11));
		
//		Function<String, Integer> f=s->s.length();
//		System.out.println("length of string is : "+f.apply("karthik"));
		
//		Function<String, Integer> f=s->s.length()-s.replaceAll(" ", "").length();
//		System.out.println(f.apply("karthik kumar pyati "));
		
		Consumer<String> c=s->System.out.println(s);
	c.accept("karthik");
	
	Supplier<Date> s=()->new Date();
	System.out.println(s.get());
	
	
	}

}
