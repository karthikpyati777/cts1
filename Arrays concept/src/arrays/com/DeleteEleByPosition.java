package arrays.com;

import java.util.ArrayList;
import java.util.List;

public class DeleteEleByPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l=new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
	}

}
