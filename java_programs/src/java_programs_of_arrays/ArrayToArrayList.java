package java_programs_of_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {12,3,4,5,6,7,1,2,34};
//		List list=Arrays.asList(a);
//		System.out.println(list);
		List<Integer> l=new ArrayList<Integer>();
//		Collections.addAll(l, a);
//		System.out.println(l);
		for (Integer integer : a) {
			l.add(integer);
		}
		System.out.println(l);
		
				
		
	}

}
