package collectionsInJava;

import java.util.List;
import java.util.Stack;

public class StackOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(5);
		s.push(3);
		s.push(9);
		s.push(7);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.capacity());
		System.out.println(s.empty());
		System.out.println(s.indexOf(5));
		s.remove(1);
		System.out.println(s);
		System.out.println(s.get(2));
		System.out.println(s.peek());
	
		
		
	}

}
