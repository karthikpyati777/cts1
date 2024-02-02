package arrays.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer []a= {1,2,3,4,8,7};
		
		List<Integer> l=new ArrayList<>(Arrays.asList(a));
		
		System.out.println(l);
		l.add(10);
		l.add(18);
		System.out.println(l);
		
	}

}
