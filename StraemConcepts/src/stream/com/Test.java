package stream.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<Integer> l=new ArrayList();
//		l.add(2);
//		l.add(5);
//		l.add(6);
//		System.out.println(l);
////		List<Integer> al=l.stream().filter(i->i%2==0).collect(Collectors.toList());
////		System.out.println(al);
//		List<Integer> k=(ArrayList<Integer>) l.stream().map((i->i+2)).collect(Collectors.toList());
//		System.out.println(k);
		
		
		List<Integer> l=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			
			l.add(i);
		}
		System.out.println(l);
		
		List<Integer> al=l.stream().filter(i->i%3==0).collect(Collectors.toList());
		System.out.println(al);
		List<Integer> la=l.stream().map(j->j+4).collect(Collectors.toList());
		System.out.println(la);
	}

}
