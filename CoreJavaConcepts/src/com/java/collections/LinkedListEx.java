package com.java.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(3);
		ll.add(18);
		ll.add(34);
		ll.add(43);
		ll.add(81);
		ll.add(2, 7);
		System.out.println(ll);
		 // adding element from the beggining
		ll.addFirst(1);
		System.out.println(ll);
		
		//add last ele on the end of the list
		ll.addLast(4);
		System.out.println(ll);
		
		//retrieve Linkedlist from the ele list
		System.out.println(ll.get(3));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		for(int i:ll) {
			System.out.print(i+" ");
		}
		//removing ele from LL
		System.out.println(ll.remove(1));
		System.out.println(ll);
		System.out.println(ll.remove(1));
		System.out.println(ll);
		ll.add(4);
		System.out.println(ll);
		System.out.println(ll.removeFirst());
		System.out.println(ll);
		System.out.println(ll.removeFirstOccurrence(ll));
		System.out.println(ll);
		System.out.println(ll.removeLast());
		System.out.println(ll);
		ll.clear();
		System.out.println(ll);
		
		ll.add(33);
		ll.add(21);
		ll.add(22);
		System.out.println(ll);
		
		
		System.out.println(ll.contains(33));
		System.out.println(ll.indexOf(22));
		System.out.println(ll.lastIndexOf(21));
		
		//iterator
		Iterator<Integer> ss=ll.iterator();
		while (ss.hasNext()) {
			Integer ll1 = (Integer) ss.next();
			System.out.print(ll1+" ");
			
		}
		System.out.println();
		//forEach
		for(int i:ll) {
			System.out.print(i+" ");
		}
		System.out.println();
		//forEach advanced loop
		ll.forEach((s)->System.out.print(s+" "));
		System.out.println();
		//simple for loop
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+" ");
		}
	}

}
