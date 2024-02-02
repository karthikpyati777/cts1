package java_programs_of_arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElements {

	static void removeDuplicate(int a[]) {
		Set<Integer> s=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			s.add(a[i]);
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,1,4,1,2,5,6,7,6,4,2};
		
		removeDuplicate(a);
		
	}

}
