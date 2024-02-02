package java_programs_of_arrays;

import java.util.Arrays;

public class EqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,4,5,6};
		int b[]= {1,3,4,6,6};
//		System.out.println(Arrays.equals(a, b));
		boolean equalOrNot=true;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					equalOrNot=false;
				}
			}
		}
		else 
			equalOrNot=false;
		
		if(equalOrNot)
			System.out.println("Two arrays are equal ");
		
		else 
			System.out.println("Two arrays are not equal ");
	}

}
