package collection.com.linkedList;

import java.util.LinkedList;

public class RemovingElementsFromLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(7);
		l.add(5);
		l.add(6);
		l.add(1);
		l.add(2);
		System.out.println(l);
		//remove 1st element in the linked list  
		System.out.println(l.removeFirst());
		System.out.println(l);
		System.out.println(l.removeLast());
		System.out.println(l);
		System.out.println(l.remove(2));
		System.out.println(l);
	    l.clear();
		System.out.println(l);
		
	}

}
