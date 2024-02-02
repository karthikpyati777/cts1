package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        List<Integer> num=Arrays.asList(2,4,1,5,6);
//        List<Integer> square= num.stream().map(x->x*x).collect(Collectors.toList());
//        System.out.println(square);
//       
//       
//       List<String> names=Arrays.asList("collectuon","reflection","stream");
//       
//       List<String> s1=names.stream().filter(s->s.startsWith("s")).collect(Collectors.toList());
//       
//       System.out.println(s1);
//       
//       int even=num.stream().filter(f->f%2==0).reduce(0,(ans,i)->ans+i);
//       System.out.println(even);
//       
//       List<Integer> g=num.stream().sorted().collect(Collectors.toList());
//       System.out.println(g);
//       
//       num.forEach(y->System.out.println(y));
		
//		List<Integer> l=Arrays.asList(1,2,6,3,4);
//		List<Integer> sum=l.stream().map(x->x+x).collect(Collectors.toList());
//		System.out.println(sum);
//		
//		List<String> sg=Arrays.asList("karthik","kumar","Pyati");
//		List<String> choice=sg.stream().filter(s->s.startsWith("k")).collect(Collectors.toList());
//		System.out.println(choice);
//		
//		int even= l.stream().filter(f->f%2==0).reduce(0, (ans,i)->ans+i);
//		System.out.println(even);
//		 List<Integer> sort=l.stream().sorted().collect(Collectors.toList());
//		 System.out.println(sort);
//		 
//		l.forEach(y->System.out.println(y));
//		
//		
//		LocalDate l1=LocalDate.now();
//		System.out.println(l1);
//		
//		LocalTime lt=LocalTime.now();
//		System.out.println(lt);
//		
//		
//		LocalDateTime t=LocalDateTime.now();
//		System.out.println(t);
		
		
//		List<Integer> l=new ArrayList();
//		l.add(1);
//		l.add(2);
//		l.add(3);
//		System.out.println(l);
//		
//		List<Integer> i=l.stream().map(x->x+x).collect(Collectors.toList());
//		System.out.println(i);
		
//		List<String> l=Arrays.asList("car","bike","bysical");
//		List<String> k=l.stream().filter(s->s.startsWith("b")).collect(Collectors.toList());
//		System.out.println(k);
//		
//		List<Integer> t=Arrays.asList(1,2,7,8,3,4,5);
//		Integer f=t.stream().filter(r->r%2==0).reduce(0,(ans,i)->ans+i);
//		System.out.println(f);
//		
//		
//		List<Integer> d=t.stream().sorted().collect(Collectors.toList());
//		System.out.println(d);
//		
//		
//		t.forEach(g->System.out.println(g));
//		
//		
//		LocalTime df=LocalTime.now();
//		System.out.println(df);
//		LocalDate gh=LocalDate.now();
//		System.out.println(gh);
//		LocalDateTime bng=LocalDateTime.now();
//		System.out.println(bng);
		
		List<Integer> l=Arrays.asList(1,4,23,67,9,2);
		List<Integer> l1=l.stream().map(x->x-2).collect(Collectors.toList());
		System.out.println(l1);
		
		
		List<String> s=Arrays.asList("karthik","manju","rohith","devu","ravi");
		List<String> s1=s.stream().filter(k->k.startsWith("r")).collect(Collectors.toList());
		System.out.println(s1);
		
		Integer d=l.stream().filter(f->f%2==0).reduce(0,(ans,i)->ans+i);
		System.out.println(d);
		
	}

}
