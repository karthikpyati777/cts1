package com;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String[] s=new String[10];
     Optional<String> checkNull=Optional.ofNullable(s[5]);
     if(checkNull.isPresent())
     {
     String tolowercase=s[5].toLowerCase();
     
     }
     else
     {
    	 System.out.println("string value is not present");
     }
     
	}

}
