package arrays.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayContainsDuplicateNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a= {1,2,3,2,3};
		
//		List<Integer> l=new ArrayList(Arrays.asList(a));
//	
//		HashSet<Integer> s=new HashSet(Arrays.asList(a));
//		
//		if(l.size()!=s.size()) 
//			System.out.println("It contain duplicate elements");
//		
//		else
//		
//			System.out.println("It does not contain duplicate elements");
		
//		
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+" ");
				}
				
			}
		}
}
}

