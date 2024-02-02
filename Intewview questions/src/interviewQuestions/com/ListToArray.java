package interviewQuestions.com;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stubz
		
		List<Integer> list=new ArrayList<>();
		
		list.add(12);
		list.add(22);
		list.add(42);
		list.add(21);
		
		Object[] arr=list.toArray();
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
