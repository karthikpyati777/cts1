package FunctionInterface.com;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		
		
//		syntax
		
//		interface Function<T,R>{
//		public R apply(T t);
//		}
		
//		
//		Function<String, Integer> f=s->(s.length());
//		System.out.println(f.apply("karthik"));

		
		
		String s1="karthik pyati";
		 
		Function<String, Integer> f=s->s.length()-s.replaceAll(" ","").length();
		System.out.println(f.apply(s1));
	}
}
