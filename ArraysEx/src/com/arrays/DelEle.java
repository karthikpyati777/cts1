package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DelEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l=new ArrayList<>(Arrays.asList(2,4,3,1,6,7,7));
		System.out.println(l);
		System.out.println(l.remove(6));
		System.out.println(l);
	}

}
