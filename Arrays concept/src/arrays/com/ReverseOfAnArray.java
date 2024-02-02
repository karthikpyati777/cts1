package arrays.com;

import java.util.Arrays;

public class ReverseOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,3,4,56,7,9,12,45};
		
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		
		for(int i=a.length-1;i>=0;i--) {
			
			System.out.print(a[i]+" ");
		}
	}

}
