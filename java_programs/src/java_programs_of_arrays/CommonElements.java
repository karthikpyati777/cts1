package java_programs_of_arrays;

import java.util.Arrays;
import java.util.HashSet;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Integer[] i1= {1,2,4,3,6,5,8};
//		Integer[] i2= {4,8,1,2,3,4,7};
//		HashSet<Integer> set1=new HashSet<>(Arrays.asList(i1));
//		HashSet<Integer> set2=new HashSet<>(Arrays.asList(i2));
//		set1.retainAll(set2);
//		System.out.println(set1);
		
		
		   // OR
		
		
		String[] s1= {"BIKE","CAR","SCOOTER","DIO"};
		String[] s2= {"HYUNDAI","DIO","BIKE","TATA NEXON"};
		
		HashSet<String> set=new HashSet<String>();
		
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				if(s1[i].equals(s2[j])) {
					set.add(s1[i]);
				}
			}
		}
		System.out.println(set);
	}

}
