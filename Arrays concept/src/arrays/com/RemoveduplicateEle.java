package arrays.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveduplicateEle {

//	public static void removeDuplicateEle(int a[]) {
//		Set<Integer> s=new HashSet<>();
//		for(int i=0;i<a.length;i++) 
//			s.add(a[i]);
//		
//	
//		System.out.println(s);
//	
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[]= {1,2,4,6,3,2,1};
		
		//removeDuplicateEle(a);
		
//		List<Integer> l=new ArrayList(Arrays.asList(a));
		
		Set<Integer> s=new HashSet<>(Arrays.asList(a));
		
		System.out.println(s);
		
		
	}

}
