package com.java8.streams;

import java.util.HashSet;
import java.util.Set;

public class AnyALLNoneMatchMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> s=new HashSet<String>();
		s.add("One mango");
		s.add("Two Apples");
		s.add("One Banana");
		s.add("Five grapes");
		
		//anyMatch->if any one the element match then it is returns true else returns false
		
		boolean res=s.stream().anyMatch(value->{
			                     return value.startsWith("One");
			                     });
		System.out.println(res);
		
		
		//allMatch->if each of the  element is  match then it is returns true else returns false
		
				boolean res1=s.stream().allMatch(value->{
					                     return value.startsWith("One");
					                     });
				System.out.println(res1);
				
				//noneMatch->Opposite of allMatch
				
				boolean res2=s.stream().noneMatch(value->{
					                     return value.startsWith("One");
					                     });
				System.out.println(res2);
	}

}
