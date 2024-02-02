package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class NeedOfCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l=new ArrayList();
		l.add(2);
		l.add(3);
		l.add(5);
		l.add(7);
		l.add(11);
		l.add(13);
//		for(int i:l) {
//			System.out.print(i+" ");
//		}
		System.out.println(l);
		
		List<Integer> pm=new ArrayList<>(l);
		System.out.println(pm);
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(17);

		l1.add(19);
		l1.add(23);
		pm.addAll(l1);
		System.out.println(pm);
	}

}
