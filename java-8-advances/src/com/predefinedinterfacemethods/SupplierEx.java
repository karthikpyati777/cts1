package com.predefinedinterfacemethods;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   Supplier<Date> d=()->new Date();
	   System.out.println("Date : "+d.get());
	}

}
