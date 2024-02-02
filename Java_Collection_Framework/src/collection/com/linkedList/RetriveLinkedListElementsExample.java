package collection.com.linkedList;

import java.util.LinkedList;

public class RetriveLinkedListElementsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(7);
		l.add(5);
		l.add(6);
		l.add(1);
		l.add(2);
		
		System.out.println(l);
		// Getting the first element in thr linkedlist using getFirst()
		Integer i=l.getFirst();
		System.out.println(i);
		// Getting the Last element in thr linkedlist using getLast()
		int a=l.getLast();
		System.out.println(a);
		int b=l.get(3);
		System.out.println(b);
		
		for (Integer integer : l) {
			System.out.print(integer);
		}
	}

}
