package com.arrays;

import java.util.Arrays;

public class Concatenation {

	public static void main(String[] args) {
		
//		int[] a= {1,2,3};
//		int[] b= {4,5,6};
//		int alen=a.length;
//		int blen=b.length;
//		int[] c= new int[alen+blen];
//		
//		System.arraycopy(a, 0, c, 0, alen);
//		System.arraycopy(b, 0, c, alen, blen);
//		System.out.println(Arrays.toString(c));

		int[] a= {1,2,3};
		int[] b= {4,5,6};
		int len=a.length+b.length;
		int pos=0;
		int[] res=new int[len];
		
		for(int a1:a) {
			res[pos]=a1;
			pos++;
		}
		for(int b1:b) {
			res[pos]=b1;
			pos++;
		}
		System.out.println(Arrays.toString(res));
	}

}
