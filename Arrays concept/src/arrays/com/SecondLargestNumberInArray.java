package arrays.com;

import java.util.Arrays;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,6,4,3,7};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Second largest element in the array : "+a[a.length-2]);

	}

}
