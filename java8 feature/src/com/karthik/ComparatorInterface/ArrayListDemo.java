package com.karthik.ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1<o2)
		return -1;
		else if (o1>o2) 
		return +1;
		else
			return 0;
		
	}
	
}
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(3);
		l.add(18);
		l.add(23);
		l.add(7);
		System.out.println("before sorting the ArrayList : " +l);
		
		Collections.sort(l,new MyComparator());
		
		System.out.println("After sorting the arrayList : "+l);
	}

}
