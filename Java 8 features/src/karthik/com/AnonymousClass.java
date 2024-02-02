package karthik.com;


abstract class A
{
	abstract void display();
}
public class AnonymousClass {

	public static void main(String[] args) {
		A a=new A() {
			void display() {
				System.out.println("hello cognizant");
			}
			
		};

		
		
		a.display();
	}

}
