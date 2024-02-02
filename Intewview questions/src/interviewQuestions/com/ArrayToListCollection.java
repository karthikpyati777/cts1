package interviewQuestions.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListCollection {
	
	public void arrayToList() {
		
		Integer a[]= {2,4,1,7,5};
		
		List<Integer> l=new ArrayList<Integer>(Arrays.asList(a));
		
		l.add(7);
		l.add(10);
		l.add(45);
		l.add(18);
		
		System.out.println(l);
		
		
	}
	public static void main(String[] args) {
		
		
		 ArrayToListCollection al=new ArrayToListCollection();
		 al.arrayToList();
		
	}

}
