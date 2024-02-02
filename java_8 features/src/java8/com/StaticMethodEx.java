package java8.com;

interface i{
	static void sum(int a,int b) {
		System.out.println("the sum is : " +(a+b));
	}
	public class StaticMethodEx implements i{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	 
			//StaticMethodEx s=new StaticMethodEx();
			i.sum(1, 2);
		}
}
//public class StaticMethodEx implements i{
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
// 
//		//StaticMethodEx s=new StaticMethodEx();
//		i.sum(1, 2);
//	}

}
