package karthik.com;
//
//public class DefaultImpl {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		I i=new R();
//		i.eat();
//        i.m();
//	}
//
//}
   

//interface A1{
//	void m1();
//}
//public class Test{
//	public static void main(String[] args) {
//		
////		A1 t=new Test();
////		t.m1();
//		A1 t=()->System.out.println("hi");
//		t.m1();
//	}
//
////	public void m1() {
////		// TODO Auto-generated method stub
////		System.out.println("hello");
////	}
//}



//interface C{
//	
//	public int sum(int x,int y);
//}
//
//public class H{
//	public static void main(String[] args) {
//		C c=(x,y)->x+y;
//		System.out.println("sum is : "+ c.sum(1, 2));
//		
//	}
//}


interface G{
	default public void m1() {
		System.out.println("Hi karthik");
	}
	public class Hi implements G{
		public static void main(String[] args) {
			Hi h=new Hi();
			h.m1();
		}
	}
}