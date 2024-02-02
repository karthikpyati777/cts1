package collection.com.linkedList;

import java.util.LinkedList;

//add()
//add(index,element)
//addFirst() and addlast() these 2 methods comes from dequeue interface
public class CreateLinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l=new LinkedList<>();
		l.add("banana");
		l.add("apple");
		l.add("mango");
		System.out.println(l);
		
		//add element at the specified position in the linkedlist
		l.add(2, "watermilon");
		System.out.println(l);
		//add element at the first position in the linkedlist
		l.addFirst("straberry");
		System.out.println(l);
		//add element at the last position in the linkedlist
		l.addLast("drakshi");
		System.out.println(l);
		

	}

}
