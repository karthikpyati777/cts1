package ConsumerInterface.com;

import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// syntax
//		interface Consumer<T>
//		{
//			void accept(T t);
//		}
		
		Consumer<String> s=f->System.out.println(f);
		s.accept("hello");
	}

}
