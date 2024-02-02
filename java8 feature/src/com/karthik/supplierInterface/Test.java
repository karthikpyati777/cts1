package com.karthik.supplierInterface;

import java.util.Date;
import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		syntax
//        interface Supplier<R>{
//        	R get();
//        }
		
		Supplier<Date> s=()->new Date();
		System.out.println(s.get());
				
	}

}
