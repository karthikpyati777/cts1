package basicsofjava.com;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Predicate<Integer> p=(n)->(n%2==0);
//		System.out.println( p.test(5));
		Predicate<String> s=(s1)->s1.length()>3;
		System.out.println(s.test("KA"));
		
		
		Function<String, Integer> f=r->r.length();
		System.out.println(f.apply("karthik"));
		
		Consumer<Integer> c=l->System.out.println(l);
		c.accept(10);
		
		Consumer<String> c1=l->System.out.println(l);
		c1.accept("karthik");
		
		Supplier<Date> d=()->new Date();
		System.out.println("date is :"+d.get());
		
		}
	}


