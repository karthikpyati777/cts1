package collection.com.list;

import java.util.ArrayList;
import java.util.List;

// creating ArrayLIst from Another Collection
public class creatingArrayLIstfromAnotherCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reate arrayList object
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(2);
		l.add(3);
		l.add(5);
		l.add(7);
		l.add(11);
		System.out.println(l);
		
		List<Integer> l1= new ArrayList<>(l);
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(13);
		l2.add(17);
		l2.add(19);
		l2.add(23);
		l2.add(29);
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);
	}

}
