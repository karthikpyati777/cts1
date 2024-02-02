package com;

import java.util.Arrays;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Map<Integer,String> m=new HashMap();
//		m.put(1, "BRUNDA");
//		m.put(2, "RAKSHITH");
//		m.put(3, "GANPATI");
//		System.out.println(m);
		
		Integer[] a= {2,5,7,1,9};
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		List<Integer> l=Arrays.asList(a);
		System.out.println(l);
 	}

}
