package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> vehicles=Arrays.asList("Bus","Car","Bike");
		List<String> convertingToUpper=new ArrayList<String>();
		
//		for(String s:vehicles) {
//			convertingToUpper.add(s.toUpperCase());
//		}
//		System.out.println(convertingToUpper);
		
		      // OR
		convertingToUpper=vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(convertingToUpper);
	}
	

}
