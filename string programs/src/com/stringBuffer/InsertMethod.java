package com.stringBuffer;

public class InsertMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("Hello ");
        //sb.insert(6, "Java");
        sb.insert(1, "java");
        // Now original string is changed
        System.out.println(sb);
	}

}
