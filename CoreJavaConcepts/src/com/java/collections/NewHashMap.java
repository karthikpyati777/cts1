package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class NewHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,Student> m=new HashMap();
		m.put(1,new Student("karthik","pyati"));
		m.put(1,new Student("pavan","kumar"));
		m.put(1,new Student("bharath","desai"));
		System.out.println(m.values());
	}

}
