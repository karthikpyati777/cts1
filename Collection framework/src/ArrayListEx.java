import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayListEx {

	public static void main(String[] args) {
//		ArrayList<Integer> a=new ArrayList();
//		a.add(1);
//		a.add(2);
//		a.add(3);
		
//		System.out.println(a);
//		System.out.println(a.size());
//		System.out.println(a.get(2));
//		System.out.println(a.contains(2));
//		System.out.println(a.isEmpty());
//		System.out.println(a.remove(1));
//		System.out.println(a);
//	a.clear();
//	System.out.println(a.isEmpty());
	
	
//	LinkedList ll=new LinkedList();
//	ll.add(12);
//	ll.add("karthik");
//	ll.add(34.6);
//System.out.println(ll);
//	System.out.println(ll.indexOf(12));
//	System.out.println(ll.lastIndexOf(34.6));
//	ll.forEach(i->System.out.println(i));
		
		
//		//autoboxing
//		int x=30;
//		Integer y=new Integer(x);
//		System.out.println(x+" "+y);
//		
//		//autounboxing
//		Integer s=new Integer(20);
//		int d=s;
//		System.out.println(s+" "+d);
//		
//		
//		Vector v=new Vector();
//		v.add(1);
//		v.add("hello");
//		v.add(1.7);
//		System.out.println(v);
		
//		Stack<Integer> s=new Stack();
//		s.push(1);
//		s.push(2);
//		s.push(3);
//		s.push(4);
//		System.out.println(s);
//		
//		s.pop();
//		System.out.println(s);
//		System.out.println(s.pop());
//		System.out.println(s);
		
		
//		Queue q=new PriorityQueue();
//		q.add(1);
//		q.add(2);
//		q.add(3);
//		q.add(4);
//		System.out.println(q);
//		System.out.println(q.poll());
//		System.out.println(q);
//		System.out.println(q.poll());
//		System.out.println(q);
		
		
//		HashSet h=new HashSet();
//		
//		h.add(1);
//		h.add(2);
//		h.add(3);
//		h.add(3);
//		h.add("hello");
//		h.add(43.8);
//		
//		h.forEach(y->System.out.println(y));
//		
//		Iterator<Integer> i=h.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
//		for(Object o:h)
//		{
//			System.out.println(o);
//		}
		
//		LinkedHashSet lhs=new LinkedHashSet<>();
//		
//		lhs.add(23);
//		lhs.add("karthik");
//		lhs.add(34.5);
//		lhs.add(34.5);
//		lhs.forEach(x->System.out.println(x));
		
//		System.out.println(h.size());
		
//		TreeSet<Integer> t=new TreeSet();
//		t.add(30);
//		t.add(40);
//		t.add(10);
//		System.out.println(t);
		
		
//		
//		HashMap hm=new HashMap();
//		hm.put(10, "dinga");
//		hm.put(2, "guldu");
//		hm.put(3, "karthik");
//		System.out.println(hm);
//		System.out.println(hm.containsKey(2));
//		System.out.println(hm.containsValue("hello"));
//		System.out.println(hm.size());
//		System.out.println(hm.isEmpty());
//		hm.clear();
//		System.out.println(hm.isEmpty());
		
//		ArrayList a=new ArrayList();
//		a.add(1);
//		a.add(2);
//		a.add(3);
//		LinkedList l=new LinkedList();
//		l.addAll(a);
//		l.add(24);
//		System.out.println(l);
//		System.out.println(l.containsAll(a));
//		System.out.println(l.removeAll(a));
//		System.out.println(l);
//		
		
		
		
		ArrayList l=new ArrayList();
		l.add(1);
		l.add("karthik");
		l.add(67.9);
		l.forEach(u->System.out.println(u));
		
//		Vector v=new Vector();
//		v.add(6);
//		v.add(4);
//		v.add(7);
//		v.add(6);
//		System.out.println(v);
		
		
		LinkedList k=new LinkedList();
		System.out.println(k.addAll(l));
		System.out.println(k.containsAll(l));
		System.out.println(k.removeAll(l));
		k.add(6);
		k.add(8);
		k.add(8);
		System.out.println(k);
		
//		Stack s=new Stack();
//		s.push(2);
//		s.push(3);
//		s.push(6);
//		System.out.println(s);
//		System.out.println(s.pop());
//		System.out.println(s);
		
		LinkedHashMap hp=new LinkedHashMap();
		hp.put(1, "karthik");
		hp.put(2, "rakshith");
		hp.put(3, "devu");
		System.out.println(hp);
//		
//		
//		Queue q=new PriorityQueue();
//		q.add(2);
//		q.add(3);
//		q.add(4);
//		System.out.println(q.poll());
//		System.out.println(q);
//		 
//		
//		HashSet h=new HashSet();
//		h.add(1);
//		h.add(1);
//		h.add(2);
//		h.add(3);
//		h.add("karthik");
//		h.add(45.8);
//		System.out.println(h);
//		
//		
//		LinkedHashSet j=new LinkedHashSet();
//		j.add(1);
//		j.add(1);
//		j.add(3);
//		j.add(2);
//		j.add(4);
//		j.add("pyati");
//		System.out.println(j);
//		
//		
//		
//		HashMap hm=new HashMap();
//		hm.put(1,"karthik");
//		hm.put(4, "karthik");
//		hm.put(2, "dinga");
//		hm.put(3, "pyati");
//		System.out.println(hm);
//		
//		
//		TreeSet t=new TreeSet();
//		t.add(30);
//		t.add(20);
//		t.add(10);
//		System.out.println(t);
//		
//		
//		
//		
		
		
		
		
		

		
		
	}

}
