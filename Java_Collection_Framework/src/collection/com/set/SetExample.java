package collection.com.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	set doesn't contain duplicate values
		Set<String> s=new HashSet<>();
		s.add("karthik");
		s.add("karthik");
		//it display only one element
		System.out.println(s);

		
	}

}
